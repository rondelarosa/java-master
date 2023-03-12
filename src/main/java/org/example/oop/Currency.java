package org.example.oop;

public enum Currency {
    USD,
    EURO;

    public double conversionRateTo(Currency target) {
        return target == Currency.USD  ? 1.0 : 1.2;
    }
}
