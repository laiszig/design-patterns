package com.laiszig.solidprinciples.liskovSubstitution.good;

/**
 * This loan interface is responsible for payment related to operations on a loan account
 * LoanPayment is implemented by HomeLoan and CreditCardLoan
 * For credit card/personal load closure and repayment operations are not supported
 */
public interface LoanPayment {

    void makePayment(int amount);
}
