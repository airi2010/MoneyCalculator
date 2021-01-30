package moneycalculator.model;

public class Money {

    private final Currency currency;
    private final double amount;

    public Money(double amount, Currency currency) {
        this.currency = currency;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
}
