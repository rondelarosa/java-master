package org.example.dp;

public class AccountsPayable {
    /**
     * JAva default to public, but it should be private
     */
    private Payable[] creditors;

    public void PayEverybody() {
        for(Payable creditor: creditors) {
            creditor.pay();
        }
    }
}
