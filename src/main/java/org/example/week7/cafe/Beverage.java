package org.example.week7.cafe;

public abstract class Beverage {
    enum SIZE {TALL, GRANDE, VENTI}
    String name;
    int basePrice;
    SIZE size;

    public Beverage(String name, int price, SIZE size) {
        this.name = name;
        this.basePrice = price;
        this.size = size;
    }

    public int getPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "name=" + name + ", Price=" + getPrice() + ", size=" + size.name() ;
    }
}
