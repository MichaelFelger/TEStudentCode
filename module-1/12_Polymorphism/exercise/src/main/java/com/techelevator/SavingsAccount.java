package com.techelevator;

public class SavingsAccount extends BankAccount {
    private final int MIN_BALANCE = 100;
    private final int WITHDRAW_FEE = 2;


    public SavingsAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public SavingsAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        // only perform transaction of positive $ and room for fee
        if (getBalance() - amountToWithdraw >= 2) {
            super.withdraw(amountToWithdraw);
            // Assess $2 fee if it goes below $150
            if (getBalance() < MIN_BALANCE) {
                super.withdraw(WITHDRAW_FEE);
            }
        }
        return getBalance();
    }
}
