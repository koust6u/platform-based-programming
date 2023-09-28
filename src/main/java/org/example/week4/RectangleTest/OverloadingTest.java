package org.example.week4.RectangleTest;

import java.util.Scanner;

public class OverloadingTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle(new Point(sc.nextInt(), sc.nextInt()),
                new Point(sc.nextInt(), sc.nextInt()));
        Rectangle rectangle2 = new Rectangle(new Point(sc.nextInt(), sc.nextInt()),
                new Point(sc.nextInt(), sc.nextInt()));

        rectangle1.moveBy(sc.nextInt(), sc.nextInt());
        rectangle2.moveBy(sc.nextInt());
        sc.close();

        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
