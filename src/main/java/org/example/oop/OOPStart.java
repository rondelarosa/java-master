package org.example.oop;

public class OOPStart {
    public static void process() {
        System.out.println("OOP start...");
        Money balance = new Money(1.0, Currency.EURO);
        Money request = new Money(1.0, Currency.USD);

        if (balance.isGreaterThan(request))
            dispenseFunds(balance, request);

        Money balance2 = new Money(5.0, Currency.EURO);
        Money request2 = new Money(1.0, Currency.USD);

        if (balance2.isGreaterThan(request2))
            dispenseFunds(balance2, request2);

        System.out.println("OOP end...");
    }

    private static void dispenseFunds(Money balance,Money request) {
        System.out.println("Balance: " + balance.getValue() + ", Dispense: " + request.getValue());
    }

}
