package az.atlacademy.module01.lesson17;

import java.util.LinkedList;
import java.util.Queue;

public class OrderApp {

    public static void main(String[] args) {
        Queue<Order> orderQueue = new LinkedList<>();

        Order order = new Order((int) (Math.random() * 100));

        orderQueue.add(order);

        System.out.println(order.processOrder());
        System.out.println(orderQueue);
        System.out.println(order.makeOrder());
        orderQueue.clear();

    }

}
