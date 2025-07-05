package DesignPatterns.creational.FactoryDesignPattern;

import DesignPatterns.creational.FactoryDesignPattern.creator.EmailNotificationCreator;
import DesignPatterns.creational.FactoryDesignPattern.creator.NotificationCreator;
import DesignPatterns.creational.FactoryDesignPattern.creator.PushNotificationCreator;
import DesignPatterns.creational.FactoryDesignPattern.creator.SMSNotificationCreator;

public class Main {
    public static void main(String[] args) {
        NotificationCreator creator;

        // Send Email
        creator = new EmailNotificationCreator();
        creator.send("Welcome to our platform!");

        // Send SMS
        creator = new SMSNotificationCreator();
        creator.send("Your OTP is 123456");

        // Send Push Notification
        creator = new PushNotificationCreator();
        creator.send("You have a new follower!");
    }
}
