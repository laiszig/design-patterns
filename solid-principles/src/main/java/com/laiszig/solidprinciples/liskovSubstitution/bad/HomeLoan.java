package com.laiszig.solidprinciples.liskovSubstitution.bad;

public class HomeLoan implements LoanPayment {

    @Override
    public void makePayment(int amount) {

    }

    @Override
    public void closeLoan() {

    }

    @Override
    public void doRepayment() {

    }
}
