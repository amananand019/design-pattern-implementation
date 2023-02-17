package observerDesignPattern;

import observerDesignPattern.observable.IphoneObservableImpl;
import observerDesignPattern.observable.StockObservable;
import observerDesignPattern.observer.EmailAlertObserverImpl;
import observerDesignPattern.observer.SMSAlertObserver;
import observerDesignPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("aman@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new SMSAlertObserver("9122505091", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.remove(observer2);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(2);
    }
}
