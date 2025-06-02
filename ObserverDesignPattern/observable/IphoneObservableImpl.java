package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> notificationObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationObserverList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : notificationObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) {
            notifyObservers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
