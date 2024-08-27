package hus.oop.design_patterns.lab11.abstractfactory.shape;

public class FactoryProducer {
    private AbstractFactory abstractFactory;

    public FactoryProducer(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public AbstractFactory getFactory() {
        return abstractFactory;
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
