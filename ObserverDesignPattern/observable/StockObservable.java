package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
