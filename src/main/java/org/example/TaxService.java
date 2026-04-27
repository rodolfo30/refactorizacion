package org.example;

public class TaxService {


    public double calculateTax(double amount, double threshold, double rateLow, double rateHigh) {
        if (amount < threshold) {
            return amount * rateLow;
        } else {
            return amount * rateHigh;
        }
    }

    public double calculateLocalTax(double amount) {
        return calculateTax(amount, 500, 0.08, 0.12);
    }

    public double calculateFederalTax(double amount) {
        return calculateTax(amount, 1000, 0.10, 0.15);
    }
}
