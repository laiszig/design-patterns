package com.laiszig.solidprinciples.liskovSubstitution.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void makePayment(int amount) {

    }

    @Override
    public void closeLoan() {
        throw new UnsupportedOperationException("Fore closure is not allowed.");
    }

    @Override
    public void doRepayment() {
        throw new UnsupportedOperationException("Repayment is not allowed.");
    }
}
