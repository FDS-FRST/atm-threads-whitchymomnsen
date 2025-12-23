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
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Montant invalide : " + amount);
            }
            this.balance += amount;
        }catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Montant invalide : " + amount);
            }
            if (balance < amount) {
                throw new InsufficientFundsException("Fonds insuffisants (solde=" + balance + ")");
            }
            this.balance -= amount;
        }catch (InvalidAmountException e) {
            System.out.println(e.getMessage());;
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }

    public double getBalance() {
        return balance;
    }
}
