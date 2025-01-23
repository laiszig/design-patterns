package com.laiszig.solidprinciples.liskovSubstitution.bad;

/**
 * This violates the Liskov Substitution Principle
 * because we are unable to substitute subtype with supertype
 * We should segregate the method in different classes and make it substitutable
 */
public class LoanClosureService {

    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    /**
     * we can't expect to call the superclass method hoping it will be overridden
     * by its subclasses, by choosing the right subtype, because they behave differently
     */
    public void forceCloseLoan() {
        loanPayment.closeLoan();
    }
}
