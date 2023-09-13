package org.example.week2.Multiple;

import java.util.Scanner;

public class MultipleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand = scanner.nextInt();

        if(operand % 2== 0 && operand% 3 == 0){
            System.out.printf("%d is a multiple of 2 and 3\n", operand);
            return;
        }
        if(operand % 2 == 0)
            System.out.printf("%d is a multiple of 2\n", operand);
        else if(operand %3 == 0)
            System.out.printf("%d is a multiple of 3\n", operand);
        else
            System.out.printf("%d is not a multiple of 2 and 3\n", operand);
    }
}
