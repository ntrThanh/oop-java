package hus.oop.design_patterns.lab11.abstractfactory.shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw round rectangle");
    }
}
