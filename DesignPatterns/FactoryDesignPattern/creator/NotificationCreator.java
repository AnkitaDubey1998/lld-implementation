package DesignPatterns.FactoryDesignPattern.creator;

import DesignPatterns.FactoryDesignPattern.product.Notification;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void send(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
