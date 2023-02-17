package observerDesignPattern.observable;

import observerDesignPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    private final List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    private static final String stockName = "Iphone";

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount = newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public String stockName() {
        return stockName;
    }
}
