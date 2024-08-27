package hus.oop.design_patterns.lab11.abstractfactory.button;

public class WinCheckBox extends CheckBox {
    public void printCheckBox() {
        System.out.println("window check box");
    }

    @Override
    public void paint() {
        System.out.println("paint by window check box");
    }
}
