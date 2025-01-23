package com.laiszig.solidprinciples.liskovSubstitution.good;

public interface SecureLoan extends LoanPayment{

    void closeLoan();
}
