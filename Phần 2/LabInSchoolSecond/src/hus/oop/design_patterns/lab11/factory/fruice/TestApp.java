package hus.oop.design_patterns.lab11.factory.fruice;

public class TestApp {
    public static void main(String[] args) throws Exception {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.providedFruit("orange");
        Fruit fruit1 = factory.providedFruit("apple");
    }
}
