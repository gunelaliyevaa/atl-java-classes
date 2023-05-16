package az.atlacademy.module01.lesson17;

import java.util.Arrays;

public class Order {
    public int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public String processOrder() {
        return "Order No: " + this.orderId + " is received!";

    }

    public String makeOrder() {

        return "Order No: " + this.orderId + " is ready!";
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                '}';
    }
}
