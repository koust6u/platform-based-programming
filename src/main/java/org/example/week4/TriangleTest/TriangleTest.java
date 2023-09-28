package org.example.week4.TriangleTest;

import java.util.Scanner;

class Triangle{
    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Double getArea(){
        return (double)base * height / 2;
    }

    @Override
    public String toString() {
        return String.format("Triangle [base=%d, height=%d, area=%.2f]",base, height, getArea());
    }
}
public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Triangle[] triangles = new Triangle[N];
        for (Triangle triangle : triangles) {
            triangle = new Triangle(scanner.nextInt(), scanner.nextInt());
            System.out.println(triangle);
        }
    }

}
