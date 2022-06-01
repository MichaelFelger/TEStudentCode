package com.techelevator;

public class CreditCardAccount implements Accountable {

    // int balance;
    String accountHolder;
    String accountNumber;
    int debt;

    //constructor
    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        //getters
    }

    public int getBalance() {
        return (-debt);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
    //methods
    public int pay(int amountToPay) {
        return debt -= amountToPay;
    }
    public int charge(int amountToCharge) {
        return debt += amountToCharge;
    }

}