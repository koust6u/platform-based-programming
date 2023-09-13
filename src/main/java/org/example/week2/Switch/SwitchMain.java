package org.example.week2.Switch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SwitchMain {
    private static List<String> month =
            Arrays.asList("January", "February", "March" , "April",
                    "May", "June", "July", "August",
                    "September", "October", "November" , "December");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> answer = new ArrayList<>();
        while(true){
            String command = scanner.next();
            int index = 0;
            if(command.equals("add"))
                index = scanner.nextInt();
            switch (command) {
                case "add" -> answer.add(month.get(index-1));
                case "print" -> System.out.println(answer);
                case "quit" -> {
                    System.out.println("Bye");
                    return;
                }
                default -> System.out.println("Invalid Command");
            }
        }
    }
}
