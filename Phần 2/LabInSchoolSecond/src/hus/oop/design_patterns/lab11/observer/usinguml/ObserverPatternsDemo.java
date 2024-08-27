package hus.oop.design_patterns.lab11.observer.usinguml;

public class ObserverPatternsDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer = new BinaryObserver(subject);
        Observer observer1 = new HexaObserver(subject);
        Observer observer2 = new OctalObserver(subject);

        subject.setState(12);
        subject.checkChange();

        observer.update();
        observer1.update();
        observer2.update();
    }
}
