package hus.oop.designpatterns.observer.example1;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Observer> list = new LinkedList<>();

        list.add(new BinaryObserver());
        list.add(new BinaryObserver());
        list.add(new BinaryObserver());
        list.add(new OctalObserver());
        list.add(new OctalObserver());

        Subject subject = new Subject(list);

        subject.upState();
        subject.notifyAllObserver();
    }
}
