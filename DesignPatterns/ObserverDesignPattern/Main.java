package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.observable.IphoneObservableImpl;
import DesignPatterns.ObserverDesignPattern.observable.StockObservable;
import DesignPatterns.ObserverDesignPattern.observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.observer.MobileAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.observer.NotificationAlertObserver;

public class Main {
    public static void main(String args[]) {
        StockObservable iPhoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver emailObserver1 = new EmailAlertObserverImpl("abc@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver emailObserver2 = new EmailAlertObserverImpl("xyz@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver mobileObserver1 = new MobileAlertObserverImpl("abc_username", iPhoneStockObservable);

        iPhoneStockObservable.add(emailObserver1);
        iPhoneStockObservable.add(emailObserver2);
        iPhoneStockObservable.add(mobileObserver1);

        iPhoneStockObservable.setStockCount(10);
    }
}
