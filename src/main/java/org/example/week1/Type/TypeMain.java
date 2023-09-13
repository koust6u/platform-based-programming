package org.example.week1.Type;

import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printType(input);
        System.out.println("Type conversion to int...");
        printType(Integer.parseInt(input));
        System.out.println("Type conversion to float...");
        printType(Float.parseFloat(input));
    }
    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {
        System.out.println(x + " is a float");
    }
}