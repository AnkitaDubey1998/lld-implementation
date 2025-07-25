package DesignPatterns.creational.FactoryDesignPattern.product;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification : " + message);
    }
}
