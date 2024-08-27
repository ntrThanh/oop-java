package hus.oop.design_patterns.lab10.observer.demostrate;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailAlertsListener implements EventListeners {
    private final String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        PrintWriter printWriter = null;
        File file = null;

        try {
            file = new File(fileName);
            printWriter = new PrintWriter(file);

            message = message.replace("%s", fileName);
            printWriter.println(message);
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
