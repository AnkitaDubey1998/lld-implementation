package DesignPatterns.structural.AdapterDesignPattern;

import DesignPatterns.structural.AdapterDesignPattern.adaptee.LegacyGateway;
import DesignPatterns.structural.AdapterDesignPattern.adapter.LegacyGatewayAdapter;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor inHouseProcessor = new InHousePaymentProcessor();
        PaymentProcessor legacyProcessor = new LegacyGatewayAdapter(new LegacyGateway());

        CheckoutService checkoutService = new CheckoutService(inHouseProcessor);
        checkoutService.checkout(100, "USD");

        System.out.println("--------------------------------");

        checkoutService = new CheckoutService(legacyProcessor);
        checkoutService.checkout(100, "USD");
    }

}
