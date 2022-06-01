package com.techelevator;

public class CheckingAccount extends BankAccount {

    public static int overdraftFee = 10;
    public static int absoluteMinimum = 100;
//    public int theBalance = getBalance();

    //constructors
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw (int amountToWithdraw) {
        if ((getBalance() - amountToWithdraw) > 0) {
            return super.withdraw(amountToWithdraw);
        } else if (getBalance() - amountToWithdraw > -absoluteMinimum) {
            return super.withdraw(amountToWithdraw + overdraftFee);
        } else {
            return getBalance();
        }
    }

}
