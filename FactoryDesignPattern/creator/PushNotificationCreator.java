package FactoryDesignPattern.creator;

import FactoryDesignPattern.product.Notification;
import FactoryDesignPattern.product.PushNotification;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
