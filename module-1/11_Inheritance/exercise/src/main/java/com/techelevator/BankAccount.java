package com.techelevator;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private int balance;

    //constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    //other constructor
    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getters
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    //methods
    public int deposit(int amountToDeposit) {
        return balance += amountToDeposit;
    }
    public int withdraw(int amountToWithdraw) {
        return balance -= amountToWithdraw;
    }

}


