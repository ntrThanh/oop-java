package hus.oop.design_patterns.lab11.factory.fruice;

public class FruitFactory {
    public Fruit providedFruit(String type) throws Exception {
        Fruit fruit;
        if (type.equals("banana")) {
            fruit = new Banana();
        } else if (type.equals("orange")) {
            fruit = new Orange();
        } else if (type.equals("apple")) {
            fruit = new Apple();
        } else {
            throw new Exception("no such fruit");
        }
        fruit.produceJuice();

        return fruit;
    }
}
