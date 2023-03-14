package org.example.reflection;

public class BankAccount {
    private String accountNumber;

    private double balanceAmount;

    public BankAccount(String accountNumber, double balanceAmount) {
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }

    public void deposit(double amount) {
        this.balanceAmount += amount;
    }

    public double getBalanceAmount() {
        return this.balanceAmount;
    }
}
