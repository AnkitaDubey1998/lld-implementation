package DesignPatterns.creational.FactoryDesignPattern.creator;

import DesignPatterns.creational.FactoryDesignPattern.product.Notification;
import DesignPatterns.creational.FactoryDesignPattern.product.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
