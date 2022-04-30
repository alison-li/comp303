/**
 * Concrete Subject
 */

import java.util.ArrayList;

public class CreditCard implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private double balance;

    public void charge(double chargedAmount) {
        balance += chargedAmount;
        notifyObserver();
    }

    public void clearBalance() {
        balance = 0.0;
        notifyObserver();
    }
    public void register(Observer o) {
        observers.add(o);
    }

    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(balance);
        }
    }
}