package hus.oop.design_patterns.lab11.abstractfactory.button;

public class MacButton extends Button {
    public void printButton() {
        System.out.println("mac button");
    }

    @Override
    public void paint() {
        System.out.println("paint by mac button");
    }
}
