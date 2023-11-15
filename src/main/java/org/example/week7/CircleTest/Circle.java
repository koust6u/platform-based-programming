package org.example.week7.CircleTest;

public class Circle implements MyComparable{

    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public int compareTo(Object other) {
        if (!(other instanceof Circle)) return -2;
        Circle otherCircle  = (Circle) other;
        int returnValue = 0;
        if (radius < otherCircle.radius) returnValue = -1;
        if (radius == otherCircle.radius) returnValue = 0;
        if (radius > otherCircle.radius) returnValue = 1;

        return returnValue;
    }

    @Override
    public boolean equal(Object other) {
        if (!(other instanceof Circle)) return false;
        Circle otherCircle = (Circle) other;
        return x == otherCircle.x && y == otherCircle.y && radius == otherCircle.radius;
    }
}
