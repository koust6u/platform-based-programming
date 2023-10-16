package org.example.week5.AbstractClassTest;

public class Triangle extends Shape{

    int a;
    int b;
    int c;


    public Triangle(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public float getLength() {
        return (float)a+ b+ c;
    }

    @Override
    public void draw() {
        System.out.printf("Triangle, Area: %.2f, Length: %.2f\n", getArea(), getLength());
    }

    @Override
    public float getArea() {
        float p = (float)(a + b +c)/2;
        return (float) Math.sqrt(p * (p-a)* (p -b) * (p -c));
    }
}
