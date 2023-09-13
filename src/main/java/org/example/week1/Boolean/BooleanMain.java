package org.example.week1.Boolean;

import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lhs = scanner.nextInt();
        int rhs = scanner.nextInt();

        System.out.println("Number1:" + lhs + ", Number2:" + rhs);
        System.out.println("Number1>Number2?" + (lhs>rhs));
        System.out.println("Number1<Number2?" + (lhs<rhs));
        System.out.println("Number1==Number2?" + (lhs==rhs));

    }
}
