package org.example.contract;

public class ContractStart {
    public static void process() {
        whoWillPay();
    }

    public static void whoWillPay() {
        AccountsPayable accounting = new AccountsPayable();
        Peon worker = new Peon();

        worker.addObserver(accounting);
        worker.pay();
    }

    private static void pay(Payable[] workers) {
        for (Payable worker : workers)
            worker.pay();
    }

    private static void payingAll() {
        Payable[] workers = new Payable[]{new Employee(), new Contractor()};
        pay(workers);
    }
}
