package org.example.contract;

public class Contractor implements Payable {
    private Payable delegate = new Payable.Implementation();
    public void pay() { delegate.pay(); }
}
