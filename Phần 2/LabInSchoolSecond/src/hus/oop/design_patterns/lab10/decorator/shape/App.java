package hus.oop.design_patterns.lab10.decorator.shape;

public class App {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new RedShapeDecorator(new Circle());

        shape1.draw();
        System.out.println();
        shape2.draw();
    }
}
