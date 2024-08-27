package hus.oop.design_patterns.lab11.observer.usinguml;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(this.getClass() +
                " update subject state: " + subject.getState());
    }
}
