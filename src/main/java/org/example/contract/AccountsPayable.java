package org.example.contract;

public class AccountsPayable implements PaymentObserver {
    /**
     * Singleton: A globally accessible, one-of-a-kind object
     */
    private static AccountsPayable instance = new AccountsPayable();

    /**
     * Singleton: A globally accessible, one-of-a-kind object - it's actual object
     */
    static AccountsPayable getInstance() {
        return instance;
    }

    /**
     * @param employee
     */
    @Override
    public void amPaying(Payable employee) {

    }
}
