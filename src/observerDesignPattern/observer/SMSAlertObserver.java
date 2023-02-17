package observerDesignPattern.observer;

import observerDesignPattern.observable.StockObservable;

public class SMSAlertObserver implements NotificationAlertObserver{
    private final String mobileNumber;
    private final StockObservable observable;

    public SMSAlertObserver(String mobile, StockObservable stockObservable) {
        this.mobileNumber = mobile;
        this.observable = stockObservable;
    }

    @Override
    public void update() {
        sendSMS(mobileNumber);
    }

    private void sendSMS(String mobile) {
        System.out.println("sms send to:" + mobile + " " + observable.stockName() + " is in stock hurry up");
    }
}
