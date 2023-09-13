package org.example.week1.String;

import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();


        System.out.println(first.equals(second));
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(first.equals(second.toLowerCase()));
        System.out.println(first.replaceAll("easy", "fun").equalsIgnoreCase(second));
    }
}
