package hus.oop.design_patterns.lab11.factory.button;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("web button render");
    }

    @Override
    public void onclick() {
        System.out.println("web button click");
    }
}
