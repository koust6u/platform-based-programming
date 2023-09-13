package org.example.week2.DateCalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat week = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        sdf.setLenient(false);
        while(true){
            printConsole();
            Menu menu = Menu.fromValue(scanner.nextInt());
            switch (menu){
                case DIFF:
                    try{
                        String day1 = scanner.next();
                        String day2 = scanner.next();
                        LocalDateTime dayOne = sdf.parse(day1).toInstant()
                                .atZone(ZoneId.systemDefault()).toLocalDateTime();
                        LocalDateTime dayTwo = sdf.parse(day2).toInstant()
                                .atZone(ZoneId.systemDefault()).toLocalDateTime();
                        System.out.printf("Menu: first date (YYYY-MM-DD): second date (YYYY-MM-DD): Diff: %d days\n",
                                ChronoUnit.DAYS.between(dayOne, dayTwo));
                    }catch (Exception e){
                        System.out.print("Menu: first date (YYYY-MM-DD): second date (YYYY-MM-DD): Invalid date format.\n");
                    }
                    break;
                case ADD_SUB:
                    String day = scanner.next();
                    long value = scanner.nextLong();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    try {
                        ZoneId zoneId = ZoneId.systemDefault();
                        Instant instant = sdf.parse(day).toInstant();
                        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
                        LocalDate plus;
                        if (value < 0){
                            plus = localDate.minusDays(-1*value);
                        }
                        else{
                            plus = localDate.plusDays(value);
                        }
                        System.out.println("Menu: date (YYYY-MM-DD): days to add/subtract: New date: "
                                + plus.format(formatter));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case WEEK:
                    String date = scanner.next();
                    try {
                        Date parse = sdf.parse(date);
                        LocalDateTime localDateTime = parse.toInstant()
                                .atZone(ZoneId.systemDefault()).toLocalDateTime();

                        String dayOfWeek = week.format(parse);

                        System.out.println("Menu: date (YYYY-MM-DD): Day of the week: "+ localDateTime.getDayOfWeek());
                    } catch (ParseException e) {
                        System.out.println("Menu: date (YYYY-MM-DD): Invalid date format.");
                    }
                    break;
                case EXIT:
                    System.out.println("Menu: Exiting...");
                    scanner.close();
                    return;
            }

        }
    }

    private static void printConsole(){
        System.out.println("1. Diff");
        System.out.println("2. Add/Sub");
        System.out.println("3. Week");
        System.out.println("4. Exit");
    }

    enum Menu{
        DIFF(1), ADD_SUB(2), WEEK(3), EXIT(4);
        private final int value;
        Menu(int value){
            this.value = value;
        }

        int getValue(){
            return this.value;
        }

        public static Menu fromValue(int value){
            for (Menu menu : Menu.values()) {
                if(menu.getValue() == value) return menu;
            }
            throw new IllegalArgumentException();
        }

    }
}
