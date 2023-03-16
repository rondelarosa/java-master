package org.example.contract;

public interface Payable {
    void pay();

    /**
     * This resolve violation on Interface segregation principle.
     * Client has option to implement default implementation
     */
    class Implementation implements Payable {
        private PaymentObserver observer;

        public void addObserver(PaymentObserver observer) {
            this.observer = observer;
        }

        public void pay() {
            this.observer.amPaying(this);
        }
    }
}
