package DesignPatterns.behavioural.ObserverDesignPattern.observer;

import DesignPatterns.behavioural.ObserverDesignPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId);
    }

    private void sendMail(String emailId) {
        System.out.println("Mail sent to : " + emailId);
    }
}
