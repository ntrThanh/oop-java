package hus.oop.design_patterns.lab11.abstractfactory.button;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        OsSystem config = new OsSystem();
        GUIFactory guiFactory;

        if (config.Os().equals("window")) {
            guiFactory = new WinFactory();
        } else if (config.equals("mac")) {
            guiFactory = new MacFactory();
        } else {
            throw new Exception("error! unknown operation system");
        }

        Application application = new Application(guiFactory);
        application.creatGUI();
        application.paint();
    }
}
