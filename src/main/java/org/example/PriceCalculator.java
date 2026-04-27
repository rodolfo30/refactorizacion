package org.example;


public class PriceCalculator {
    public double calculateFinalPrice(Sale sale) {
        double discount = DiscountPolicy.apply(sale.getBasePrice());
        double discountedPrice = sale.getBasePrice() - discount;
        return SalexTax.applyTax(discountedPrice);
    }
}
