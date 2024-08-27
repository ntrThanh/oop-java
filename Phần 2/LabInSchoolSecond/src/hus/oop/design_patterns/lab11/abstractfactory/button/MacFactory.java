package hus.oop.design_patterns.lab11.abstractfactory.button;

public class MacFactory implements GUIFactory {
    @Override
    public Button creatButton() {
        return new MacButton();
    }

    @Override
    public CheckBox creatCheckBox() {
        return new MacCheckBox();
    }
}
