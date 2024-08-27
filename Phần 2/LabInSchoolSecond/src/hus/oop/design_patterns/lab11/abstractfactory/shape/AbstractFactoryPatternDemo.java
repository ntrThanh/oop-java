package hus.oop.design_patterns.lab11.abstractfactory.shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) throws Exception {
        FactoryProducer factoryProducer = new FactoryProducer(new ShapeFactory("rectangle"));
        Shape shape = factoryProducer.getFactory().getShape();

        shape.draw();
    }
}
