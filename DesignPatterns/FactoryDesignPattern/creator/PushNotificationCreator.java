package DesignPatterns.FactoryDesignPattern.creator;

import DesignPatterns.FactoryDesignPattern.product.Notification;
import DesignPatterns.FactoryDesignPattern.product.PushNotification;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
