package DesignPatterns.FactoryDesignPattern.creator;

import DesignPatterns.FactoryDesignPattern.product.Notification;
import DesignPatterns.FactoryDesignPattern.product.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
