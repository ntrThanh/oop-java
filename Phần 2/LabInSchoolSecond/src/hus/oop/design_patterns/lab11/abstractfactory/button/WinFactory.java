package hus.oop.design_patterns.lab11.abstractfactory.button;

public class WinFactory implements GUIFactory {
    @Override
    public Button creatButton() {
        return new WinButton();
    }

    @Override
    public CheckBox creatCheckBox() {
        return new WinCheckBox();
    }
}
