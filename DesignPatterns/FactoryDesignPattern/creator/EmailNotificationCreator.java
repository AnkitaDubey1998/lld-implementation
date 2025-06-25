package DesignPatterns.FactoryDesignPattern.creator;

import DesignPatterns.FactoryDesignPattern.product.EmailNotification;
import DesignPatterns.FactoryDesignPattern.product.Notification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
