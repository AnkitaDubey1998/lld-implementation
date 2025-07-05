package DesignPatterns.structural.AdapterDesignPattern.adapter;

import DesignPatterns.structural.AdapterDesignPattern.PaymentProcessor;
import DesignPatterns.structural.AdapterDesignPattern.adaptee.LegacyGateway;

public class LegacyGatewayAdapter implements PaymentProcessor {

    private LegacyGateway legacyGateway;

    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void processPayment(double amount, String currency) {
        legacyGateway.executeTransaction(amount, currency);
        System.out.println("LegacyGatewayAdapter: Payment processed successfully. Txn ID: " + legacyGateway.getReferenceNumber());
    }

    @Override
    public boolean isPaymentSuccessful() {
        return legacyGateway.checkStatus(legacyGateway.getReferenceNumber());
    }

    @Override
    public String getTransactionId() {
        return String.valueOf(legacyGateway.getReferenceNumber());
    }
}
