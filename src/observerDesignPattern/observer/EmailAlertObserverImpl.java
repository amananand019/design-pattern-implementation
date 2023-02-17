package observerDesignPattern.observer;

import observerDesignPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private final String emailId;
    private final StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId);
    }

    private void sendEmail(String emailId) {
        System.out.println("mail send to:" + emailId + " " + observable.stockName() + " is in stock hurry up");
    }


}
