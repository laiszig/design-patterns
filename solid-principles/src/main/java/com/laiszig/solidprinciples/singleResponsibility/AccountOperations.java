package com.laiszig.solidprinciples.singleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {

    private static Map<Integer, Account> accountMap = new HashMap<>();
    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    /**
     * This method should not be part of AccountOperations
     * It is responsible for calling operations for the accounts
     * such as add, update and get. Deposit is a transaction.
     *
     * Adding this method violates the single responsibility principle.
     * Create a new class responsible for Transactions.
     * @param amount
     * @param accountNumber
     */
    public void deposit(int amount, int accountNumber) {
        // Move this method to different class
    }
}
