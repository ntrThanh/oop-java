package hus.oop.designpatterns.observer.example1;

public class BinaryObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("update the state for binary observer is " + subject.getState());
    }
}
