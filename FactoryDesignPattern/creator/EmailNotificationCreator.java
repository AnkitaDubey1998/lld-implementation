package FactoryDesignPattern.creator;

import FactoryDesignPattern.product.EmailNotification;
import FactoryDesignPattern.product.Notification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
