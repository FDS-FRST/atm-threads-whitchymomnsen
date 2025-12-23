package ht.ueh.first.java;

import ht.ueh.first.java.enums.ActionType;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount(1, 1000);
        account.deposit(200);
        account.withdraw(150);
        System.out.println("Solde final : " + account.getBalance() + " €");

        Thread t1 = new Thread(new ATMTask(account, ActionType.WITHDRAW, 700), "Client-1");
        Thread t2 = new Thread(new ATMTask(account, ActionType.WITHDRAW, 700), "Client-2");

        t1.start();
        t2.start();
        Thread.sleep(5000);
        System.out.println("Solde final : " + account.getBalance() + " €");

    }
}