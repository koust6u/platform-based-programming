package org.example.week7.CircleTest;

public class Rectangle implements MyComparable{
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Object other) {
        if (other instanceof Rectangle){
            Rectangle rectangle = (Rectangle) other;
            return width * height - rectangle.height * rectangle.width;
        }
        return 0;
    }

    @Override
    public boolean equal(Object other) {
        if (other instanceof Rectangle){
            Rectangle r = (Rectangle) other;
            return r.width == width & r.height == height;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{area=%d}", width* height);
    }
}
