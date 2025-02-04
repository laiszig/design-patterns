package com.laiszig.chainofresponsibility.bankHandler;

public class PaypalPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("Paid using PayPal: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
