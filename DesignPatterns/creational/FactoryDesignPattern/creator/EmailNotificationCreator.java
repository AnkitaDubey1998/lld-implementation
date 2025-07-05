package DesignPatterns.creational.FactoryDesignPattern.creator;

import DesignPatterns.creational.FactoryDesignPattern.product.EmailNotification;
import DesignPatterns.creational.FactoryDesignPattern.product.Notification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
