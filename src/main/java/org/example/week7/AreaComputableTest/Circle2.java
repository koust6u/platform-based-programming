package org.example.week7.AreaComputableTest;

public class Circle2 implements MyComparable, AreaComputable{

    private int x, y;
    private int radius;

    public Circle2(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle{x=%d,y=%d, radius=%d}",x,y,radius);
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Object other) {
        return 0;
    }

    @Override
    public boolean equal(Object other) {
        return false;
    }
}
