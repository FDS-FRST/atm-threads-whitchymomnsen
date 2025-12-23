package ht.ueh.first.java;

import ht.ueh.first.java.exceptions.InsufficientFundsException;
import ht.ueh.first.java.exceptions.InvalidAmountException;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Montant invalide : " + amount);
        }
        this.balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Montant invalide : " + amount);
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Fonds insuffisants (solde=" + balance + ")");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
