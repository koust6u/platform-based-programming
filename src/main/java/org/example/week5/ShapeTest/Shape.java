package org.example.week5.ShapeTest;

public abstract class Shape {

    private int color;
    int getLineColor(){
        return this.color;
    }
    abstract float getLength();
    abstract void draw();

    abstract float getArea();
}
