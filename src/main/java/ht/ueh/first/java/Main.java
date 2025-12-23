package ht.ueh.first.java;

import ht.ueh.first.java.enums.ActionType;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount(1, 10000);
//        account.deposit(200);
//        account.withdraw(150);
//        System.out.println("Solde final : " + account.getBalance() + " €");
//
//        Thread t1 = new Thread(new ATMTask(account, ActionType.WITHDRAW, 700), "Client-1");
//        Thread t2 = new Thread(new ATMTask(account, ActionType.WITHDRAW, 700), "Client-2");
//
//        t1.start();
//        t2.start();
//        Thread.sleep(5000);
//        System.out.println("Solde final : " + account.getBalance() + " €");


        Random random = new Random();

//        for (int i = 1; i <= 10; i++) {
//            Thread client = new Thread(() -> {
//                for (int j = 0; j < 5; j++) {
//                    int choice = random.nextInt(3);
//                    double amount = random.nextInt(5000) + 1;
//
//                    try {
//                        switch (choice) {
//                            case 0 -> account.deposit(amount);
//                            case 1 -> account.withdraw(amount);
//                            case 2 -> System.out.println(
//                                    Thread.currentThread().getName() +
//                                            " consulte solde = " + account.getBalance());
//                        }
//                        Thread.sleep(300);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }, "Client-" + i);
//
//            client.start();
//        }

        account.withdraw(7000);
        account.withdraw(7000);
        account.deposit(-5000);
        account.getBalance();

    }
}