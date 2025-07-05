package DesignPatterns.structural.AdapterDesignPattern;

public interface PaymentProcessor {
    void processPayment(double amount, String currency);
    boolean isPaymentSuccessful();
    String getTransactionId();
}
