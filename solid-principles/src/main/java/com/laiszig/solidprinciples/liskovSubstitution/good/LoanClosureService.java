package com.laiszig.solidprinciples.liskovSubstitution.good;

/**
 * This is a good example of Liskov Substitution Principle
 * It will behave correctly even if we substitute the parent class with a child
 */
public class LoanClosureService {

    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void forceCloseLoan() {
        secureLoan.closeLoan();
    }
}
