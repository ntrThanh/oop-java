package hus.oop.lab7.secondanimal;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof");
    }

    public void greeting(Dog anotherDog) {
        System.out.println("Woof");
    }
}
