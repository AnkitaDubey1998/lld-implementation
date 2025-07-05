package DesignPatterns.creational.FactoryDesignPattern.creator;

import DesignPatterns.creational.FactoryDesignPattern.product.Notification;
import DesignPatterns.creational.FactoryDesignPattern.product.PushNotification;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
