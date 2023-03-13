package org.example.contract;

public class ContractStart {
    public static void process() {
        Payable[] workers = new Payable[]{new Employee(), new Contractor()};
        pay(workers);
    }

    private static void pay(Payable[] workers) {
        for (Payable worker : workers)
            worker.pay();
    }
}
