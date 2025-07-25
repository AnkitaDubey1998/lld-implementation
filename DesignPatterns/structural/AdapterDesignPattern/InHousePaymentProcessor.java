package DesignPatterns.structural.AdapterDesignPattern;

public class InHousePaymentProcessor implements PaymentProcessor {
    private String transactionId;
    private boolean isPaymentSuccessful;

    @Override
    public void processPayment(double amount, String currency) {
        // Process payment logic
        transactionId = "TXN_" + System.currentTimeMillis();
        isPaymentSuccessful = true;
        System.out.println("InHousePaymentProcessor: Payment successful. Txn ID: " + this.transactionId);
    }

    @Override
    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
