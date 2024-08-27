package hus.oop.design_patterns.lab10.singleton.bank;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    public static Lock lock = new ReentrantLock();
    private static Bank bankInstance;
    private final List<String> transactionHistory;
    private double financialBalance;

    private Bank() {
        financialBalance = 10000000;
        transactionHistory = new LinkedList<>();
    }

    public static Bank getInstance() {
        if (bankInstance == null) {
            acquireThreadLock();  // lock thread;

            if (bankInstance == null) {
                Bank.bankInstance = new Bank();
            }
        }

        return bankInstance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public double getFinancialBalance() {
        return financialBalance;
    }

    public static void acquireThreadLock() {
        lock.lock();
    }

    public void depositToBank(double money, String date) {
        this.financialBalance += money;

        transactionHistory.add("deposit the amount: " + money + " | date: " + date);
    }

    public void loanMoneyOfBank(double money, String date) {
        if (money >= financialBalance) {
            transactionHistory.add("error! money > finance => can not loan | date: " + date);
            return;
        }
        this.financialBalance -= money;

        transactionHistory.add("loan amount: " + money + " | date: " + date);
    }
}
