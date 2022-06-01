package com.techelevator;

public class SavingsAccount extends BankAccount {

    public static int serviceCharge = 2;
    public static int minimumBalance = 150;
//    public int theBalance = getBalance();

    //constructors
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw (int amountToWithdraw) {
        if ((getBalance() - amountToWithdraw) >= minimumBalance) {
            return super.withdraw(amountToWithdraw);
        } else if (getBalance() - amountToWithdraw >= serviceCharge) {
            return super.withdraw(amountToWithdraw + serviceCharge);
        } else {
            return getBalance();
        }
    }
}
