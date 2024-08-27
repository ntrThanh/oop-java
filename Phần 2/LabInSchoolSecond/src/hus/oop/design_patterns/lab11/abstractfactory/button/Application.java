package hus.oop.design_patterns.lab11.abstractfactory.button;

public class Application {
    private final GUIFactory guiFactory;
    private Button button;

    public GUIFactory getGuiFactory() {
        return guiFactory;
    }

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void creatGUI() {
        button = getGuiFactory().creatButton();
    }

    public void paint() {
        button.paint();
    }
}
