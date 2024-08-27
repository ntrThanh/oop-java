package hus.oop.design_patterns.lab11.observer.demostrate;

public class Application {
    public static void main(String[] args) {
        config();
    }

    public static void config() {
        Editor editor = new Editor();

        EventListeners logger = new LoggingListener(
                "C:\\Users\\Trong Thanh\\Documents\\TestData\\testdatadesignpatterns.txt",
                "Someone has opened the file: %s");
        editor.getEventManager().subscribe("open", logger);
        logger.update("C:\\Users\\Trong Thanh\\Documents\\TestData\\testdatadesignpatterns.txt");

        EventListeners email = new EmailAlertsListener(
                "\"C:\\Users\\Trong Thanh\\Documents\\TestData\\testdatadesignpatterns.txt\"",
                "Someone has changed the file: %s");
        editor.getEventManager().subscribe("save", email);
        email.update("C:\\Users\\Trong Thanh\\Documents\\TestData\\testdatadesignpatterns.txt");
    }
}
