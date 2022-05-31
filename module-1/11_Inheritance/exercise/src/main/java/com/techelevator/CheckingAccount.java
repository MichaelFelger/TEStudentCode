package com.techelevator;

public class CheckingAccount extends BankAccount {

    public static int overdraftFee = 10;
    public int theBalance = getBalance();

    //constructors
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw (int amountToWithdraw) {
        if ((theBalance - amountToWithdraw) > 0) {
            return super.withdraw(amountToWithdraw);
        } else if (theBalance - amountToWithdraw > -100) {
            return super.withdraw(amountToWithdraw + overdraftFee);
        } else {
            return theBalance;
        }
    }

}
