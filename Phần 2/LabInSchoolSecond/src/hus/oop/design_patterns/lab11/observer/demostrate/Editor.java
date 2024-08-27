package hus.oop.design_patterns.lab11.observer.demostrate;

import java.io.File;

public class Editor {
    private EventManager eventManager;
    private File file;

    public Editor() {
        eventManager = new EventManager();
    }

    public void openFile(String fileName) {
        this.file = new File(fileName);
        eventManager.notifyListeners("open", file.getName());
    }

    public void saveFile() {
        file.canWrite();
        eventManager.notifyListeners("save", file.getName());
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }
}
