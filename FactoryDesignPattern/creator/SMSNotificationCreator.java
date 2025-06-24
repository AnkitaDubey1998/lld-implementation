package FactoryDesignPattern.creator;

import FactoryDesignPattern.product.Notification;
import FactoryDesignPattern.product.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
