package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();
    private final int VIP_MINIMUM_NET_WORTH = 25000;

    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //methods
    public Accountable[] getAccounts() {
        Accountable[] acctArr = accounts.toArray(new Accountable[0]);

        return acctArr;
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public boolean isVip()  {
        int netWorth = 0;
        for (Accountable account : accounts) {
            netWorth += account.getBalance();
        } return netWorth >= VIP_MINIMUM_NET_WORTH;
    }


}
