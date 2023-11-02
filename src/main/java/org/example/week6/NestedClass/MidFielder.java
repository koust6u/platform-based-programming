package org.example.week6.NestedClass;

public class MidFielder extends Player {
    @Override
    protected int getSpeed() {
        return super.speed;
    }

    @Override
    public String toString() {
        return super.toString() + "Midfielder";
    }
}
