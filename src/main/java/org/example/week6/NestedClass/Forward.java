package org.example.week6.NestedClass;

public class Forward extends Player {

    @Override
    protected int getSpeed() {
        return super.speed + 10;
    }

    @Override
    public String toString() {
        return super.toString() +"Forward";
    }
}
