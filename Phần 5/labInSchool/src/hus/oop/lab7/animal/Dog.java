package hus.oop.lab7.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("woof");
    }

    public void greets(Dog anotherDog) {
        System.out.println("Wooooof");
    }
}
