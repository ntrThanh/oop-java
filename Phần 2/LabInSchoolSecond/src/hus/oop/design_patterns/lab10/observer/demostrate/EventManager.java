package hus.oop.design_patterns.lab10.observer.demostrate;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private final HashMap<String, EventListeners> listeners;

    public EventManager() {
        listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListeners eventListeners) {
        listeners.put(eventType, eventListeners);
    }

    public void unsubscribe(String eventType, EventListeners eventListeners) {
        listeners.remove(eventType, eventListeners);
    }

    public void notifyListeners(String evenType, String fileName) {
        for (Map.Entry<String, EventListeners> list : listeners.entrySet()) {
            if (list.getKey().equals(evenType)) {
                list.getValue().update(fileName);
            }
        }
    }
}
