package org.example.oop;

public class Money {
    private final double value;
    private final Currency currency;

    public Money(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return this.value;
    }
    private double normalized() {
        return currency == Currency.USD
                ? value
                : value * currency.conversionRateTo(Currency.USD);
    }

    public boolean isGreaterThan(Money op) {
        return (normalized() > op.normalized());
    }
}
