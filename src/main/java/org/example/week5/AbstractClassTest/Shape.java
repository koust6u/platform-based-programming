package org.example.week5.AbstractClassTest;

public abstract class Shape {
    private int lineColor;


    public Shape(){
        this.lineColor = 1;
    }
    public Shape(int lineColor) {
        this.lineColor = lineColor;
    }

    public int getLineColor() {
        return lineColor;
    }

    public void setLineColor(int lineColor) {
        this.lineColor = lineColor;
    }

    abstract public float getLength();

    public abstract void draw();

    public abstract float getArea();
}
