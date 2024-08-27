package hus.oop.design_patterns.lab10.observer.usinguml;

public abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public abstract void update();
}
