package org.example.week1.Operation;

import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lhs =scanner.nextInt();
        int rhs = scanner.nextInt();

        System.out.printf("%d/%d=%.3f\n",lhs, rhs, (float)lhs/rhs);
        System.out.printf("%d=%dx%d+%d",rhs,lhs/rhs,rhs,lhs%rhs);
    }
}
