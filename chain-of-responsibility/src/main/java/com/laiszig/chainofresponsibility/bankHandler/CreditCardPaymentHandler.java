package com.laiszig.chainofresponsibility.bankHandler;

public class CreditCardPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 100) {
            System.out.println("Paid using credit card: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
