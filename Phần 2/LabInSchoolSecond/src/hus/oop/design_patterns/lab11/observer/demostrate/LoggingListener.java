package hus.oop.design_patterns.lab11.observer.demostrate;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggingListener implements EventListeners {
    private File log;
    private String message;

    public LoggingListener(String fileName, String message) {
        this.message = message;
        log = new File(fileName);
    }

    @Override
    public void update(String fileName) {
        PrintWriter printWriter = null;

        try {
            log = new File(fileName);
            printWriter = new PrintWriter(log);

            message = message.replace("%s", fileName);
            printWriter.print(message);
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
