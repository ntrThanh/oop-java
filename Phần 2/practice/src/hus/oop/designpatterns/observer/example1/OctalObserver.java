package hus.oop.designpatterns.observer.example1;

public class OctalObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("update the state for octal observer is " + subject.getState());
    }
}
