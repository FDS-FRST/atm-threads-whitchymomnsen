package ht.ueh.first.java;

import ht.ueh.first.java.enums.ActionType;

public class ATMTask implements Runnable {

    private BankAccount account;
    private ActionType action;
    private double amount;

    public ATMTask(BankAccount account, ActionType action, double amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void run() {

        switch (action) {

            case DEPOSIT:
                account.deposit(amount);
                System.out.println(
                        Thread.currentThread().getName() +
                                " a déposé " + amount + " €"
                );
                break;

            case WITHDRAW:
                account.withdraw(amount);
                System.out.println(
                        Thread.currentThread().getName() +
                                " a retiré " + amount + " Gourdes"
                );
                break;

            case BALANCE:
                System.out.println(
                        Thread.currentThread().getName() +
                                " consulte le solde : " +
                                account.getBalance() + " Gourdes"
                );
                break;
        }
    }
}
