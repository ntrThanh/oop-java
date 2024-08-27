package hus.oop.design_patterns.lab10.observer.usinguml;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(this.getClass() +
                " update subject state: " + subject.getState());
    }
}
