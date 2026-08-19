package com.ledger;

public class Account {
    private final String id;
    private double balance;


    public Account(String id, double balance) {
        this.id = id;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
       if(amount>balance){
           throw new InsufficientFundsException(id,amount,balance);
       }
       balance=balance-amount;
    }

}
