package observerDesignPattern.observable;

import observerDesignPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
    void setStockCount(int newStockCount);
    int getStockCount();
    String stockName();
}
