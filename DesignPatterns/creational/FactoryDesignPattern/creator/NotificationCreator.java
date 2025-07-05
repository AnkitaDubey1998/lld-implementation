package DesignPatterns.creational.FactoryDesignPattern.creator;

import DesignPatterns.creational.FactoryDesignPattern.product.Notification;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void send(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
