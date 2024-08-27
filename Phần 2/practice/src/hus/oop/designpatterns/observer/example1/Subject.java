package hus.oop.designpatterns.observer.example1;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> list;
    private int state;
    public Subject(List<Observer> list) {
        this.list = list;
        this.state = 0;
    }

    public Subject() {
        list = new LinkedList<>();
        this.state = 0;
    }

    public void upState() {
        this.state++;
    }

    public int getState() {
        return state;
    }

    public void notifyAllObserver() {
        for(int i = 0; i < list.size(); i++) {
            list.get(i).update(this);
        }
    }
}
