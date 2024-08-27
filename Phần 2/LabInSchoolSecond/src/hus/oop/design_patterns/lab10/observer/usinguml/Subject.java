package hus.oop.design_patterns.lab10.observer.usinguml;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private final List<Observer> observerList;
    private int state;
    private int oldState;

    public Subject() {
        this.observerList = new LinkedList<>();
        this.state = 0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        oldState = this.state;
        this.state = state;
    }

    public void attack() {
    }

    public void checkChange() {
        if (this.state != oldState) {
            notification();
        }
    }

    public void notification() {
        notifyAllObserver();
    }

    public void notifyAllObserver() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }
}
