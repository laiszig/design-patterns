package com.laiszig.solidprinciples.singleResponsibility;

import java.math.BigDecimal;

public class SRPMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(123);
        account.setFirstName("John");
        account.setTotalAmount(new BigDecimal(100000));

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(new BigDecimal(1000), 123);
    }
}
