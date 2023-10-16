package org.example.week5.AbstractClassTest;

import java.util.ArrayList;
import java.util.List;

public class AbstractClassTest {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Triangle t1 = new Triangle(10, 10, 10);
        Rectangle r1 = new Rectangle(10, 10);
        Circle c1 = new Circle(10);

        shapes.add(c1); shapes.add(t1); shapes.add(r1);

        for (Shape s : shapes) System.out.printf("%.2f%n", s.getLength());
        for (Shape s : shapes) System.out.printf("%.2f%n", s.getArea());
        for (Shape s : shapes) s.draw();
    }
}
