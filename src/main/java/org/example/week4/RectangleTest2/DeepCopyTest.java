package org.example.week4.RectangleTest2;

import java.util.Scanner;

public class DeepCopyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());

        Rectangle rectangle1 = new Rectangle(p1, p2);
        Rectangle rectangle2 = new Rectangle(rectangle1);

        rectangle1.moveBy(sc.nextInt(), sc.nextInt());
        sc.close();

        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
