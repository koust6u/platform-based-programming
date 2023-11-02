package org.example.week6.LocalInnerClass;

import java.util.Scanner;

public class LocalInnerClassTest {
    public static void main(String[] args) {

        new LocalInnerClassTest().run();

    }



    private void run() {

        class Time {

            // your code here
            private int hour;
            private int minute;
            private int second;


            public Time(int hour, int minute, int second) {

                // your code here

                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }



            @Override
            public String toString() {
                return String.format("Time[%d:%d:%d]", this.hour, this.minute, this.second);
            }

        }

        Scanner sc = new Scanner(System.in);

        Time time1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        Time time2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();

        System.out.println(time1);

        System.out.println(time2);

    }
}
