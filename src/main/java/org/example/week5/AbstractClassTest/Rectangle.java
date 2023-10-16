package org.example.week5.AbstractClassTest;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle( int width, int height) {
        super();
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
    public float getLength() {
        return (float)this.height*2 + this.width*2;
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle, Area: %.2f, Length: %.2f\n",getArea(), getLength());
    }

    @Override
    public float getArea() {
        return (float) height * width;
    }
}
