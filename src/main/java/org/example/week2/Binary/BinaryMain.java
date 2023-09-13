package org.example.week2.Binary;

import java.util.Scanner;

public class BinaryMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);

        System.out.printf("Number %d in Binary Number: %s",decimal, binary);
    }

    private static String decimalToBinary(int decimal){
        if (decimal == 0) return "0";

        StringBuilder builder = new StringBuilder();
        while(decimal > 0){
            int remainder = decimal %2;
            builder.insert(0, remainder);
            decimal /= 2;
        }

        return builder.toString();
    }
}
