package ht.ueh.first.java;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public synchronized void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
