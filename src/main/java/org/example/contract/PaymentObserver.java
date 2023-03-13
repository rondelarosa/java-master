package org.example.contract;

public interface PaymentObserver {

    /**
     * Tells who to pay
     * @param employee
     */
    public void amPaying(Payable employee);
}
