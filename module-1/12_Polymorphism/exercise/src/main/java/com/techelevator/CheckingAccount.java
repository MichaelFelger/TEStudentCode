package com.techelevator;

public class CheckingAccount extends BankAccount {
    private final int MAX_NEGATIVE_BALANCE = -100;
    private final int OVERDRAFT_FEE = 10;

    public CheckingAccount(String accountHolder, String accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }

    public CheckingAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        // Only allow the withdraw if the balance isn't going to go below -$100
        if (getBalance() - amountToWithdraw > MAX_NEGATIVE_BALANCE) {
            // Withdraw the $$
            super.withdraw(amountToWithdraw);
            // If the balance dips below 0, assess $10 charge
            if (getBalance() < 0) {
                super.withdraw(OVERDRAFT_FEE);
            }
        }
        return getBalance();
    }
}
