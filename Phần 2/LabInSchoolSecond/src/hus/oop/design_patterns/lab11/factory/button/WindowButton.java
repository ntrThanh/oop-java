package hus.oop.design_patterns.lab11.factory.button;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("window button render");
    }

    @Override
    public void onclick() {
        System.out.println("click button window");
    }
}
