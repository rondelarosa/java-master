package org.example.dp;

import java.util.Currency;

public class Contractor extends Worker {
    public Contractor(String name) { super(name); }

    private Invoice[] invoicesDue;

    public void attachInvoice(Invoice i) {}

    /**
     * @return
     */
    @Override
    protected Money getAmountDue() {
        return new Money(11.23, Currency.getInstance("USD"));
    }
}
