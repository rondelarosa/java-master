package org.example.dp;

import java.util.Currency;

public class Employee extends Worker {
    private Timesheet[] unpaidTimesheets;
    public Employee(String name) { super(name); }

    public void attachTimesheet(Timesheet i) {}

    protected Money getAmountDue() {
        return new Money(12.34, Currency.getInstance("USD"));
    }
}
