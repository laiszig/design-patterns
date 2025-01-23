package com.laiszig.solidprinciples.singleResponsibility;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(BigDecimal amount, int accountNumber) {
        // Getting account details is a job for the AccountOperations class
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
