package hus.oop.design_patterns.lab11.abstractfactory.button;

public class WinButton extends Button {
    public void printButton() {
        System.out.println("window button");
    }

    @Override
    public void paint() {
        System.out.println("paint by window button");
    }
}
