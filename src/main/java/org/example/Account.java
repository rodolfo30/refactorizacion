package org.example;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    public Account(AccountType type, int daysOverdrawn) {
        this.type = type;
        this.daysOverdrawn = daysOverdrawn;
    }


    double overdraftCharge() {
        return type.overdraftCharge(daysOverdrawn);
    }

    double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}
