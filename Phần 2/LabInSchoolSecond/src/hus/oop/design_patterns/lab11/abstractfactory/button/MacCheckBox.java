package hus.oop.design_patterns.lab11.abstractfactory.button;

public class MacCheckBox extends CheckBox {
    public void printCheckBox() {
        System.out.println("max check box");
    }

    @Override
    public void paint() {
        System.out.println("paint by mac check box");
    }
}
