package org.example.week7.cafe;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    private static int orderCounter = 1;
    private int orderNo ;

    private Order.PickUp delivery;
    public Order() {
        orderNo = orderCounter++;
    }


    public void notice(){
        delivery.handle(this);
    }
    public int getOrderNo() {
        return orderNo;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void completed() {
        orderCounter = 1;
    }

    public void setPickUp(PickUp pickUp) {
        delivery = pickUp;
    }

    public interface PickUp{
        void handle(Order o);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (OrderItem item : items) {
            sb.append(item.toString());
            sb.append(", ");
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - 2));
        sb.append("]\n");
        return sb.toString();
    }
}
