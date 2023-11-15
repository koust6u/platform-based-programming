package org.example.week7.cafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();

    private int idx = 0;
    @Override
    public boolean hasNext() {
        return orders.size() > idx;
    }

    @Override
    public Order next() {
        Order order = orders.get(idx);
        order.notice();
        return orders.get(idx++);
    }

    public void add(Order order){
        orders.add(order);
    }
    // your code here


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- 주문 관리자 화면 ---\n");
        sb.append("현재 주문수는 총 "+ (this.orders.size() - idx) + " 입니다.\n\n");
        sb.append("< 주문 내역 >\n");
        IntStream.range(idx, orders.size())
                .forEach(i -> sb.append("주문번호: ")
                        .append(i+1+ " - ")
                        .append(orders.get(i)));

        return sb.toString();
    }
}
