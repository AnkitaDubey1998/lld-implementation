package DesignPatterns.behavioural.ObserverDesignPattern.observer;

import DesignPatterns.behavioural.ObserverDesignPattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName);
    }

    private void sendMessageOnMobile(String userName) {
        System.out.println("Message sent to : " + userName);
    }
}
