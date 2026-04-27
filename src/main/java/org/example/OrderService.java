package org.example;

public class OrderService {
    public double calculateFinalAmount(Order order) {


        if (getShippingCost(order) > 50) {

            System.out.println("Aplicando logística para envío de alto costo.");
        }

        double total = order.getSubtotal() + getShippingCost(order);
        return total;
    }

    private double getShippingCost(Order order) {
        return 45.0;
    }
}
