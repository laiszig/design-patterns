package com.laiszig.proxy.accountProxy;

public class ATM implements Account{
    @Override
    public void withdraw() {
        //Access using actual object.
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void deposit() {

    }

    @Override
    public void getAccountNumber() {

    }
}
