package com.techelevator;

public class SavingsAccount extends BankAccount {

    public static int serviceCharge = 2;
    public int theBalance = getBalance();

    //constructors
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw (int amountToWithdraw) {
        if ((theBalance - amountToWithdraw) >= 150) {
            return super.withdraw(amountToWithdraw);
        } else if (theBalance - amountToWithdraw >= 2) {
            return super.withdraw(amountToWithdraw + serviceCharge);
        } else {
            return theBalance;
        }
    }
}
