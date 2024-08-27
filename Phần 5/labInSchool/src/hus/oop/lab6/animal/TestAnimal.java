package hus.oop.lab6.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("My Cat");
        System.out.println(cat);
        System.out.println();

        Dog dog = new Dog("My Dog");
        System.out.println(dog);
        System.out.println();

        Mammal mammal = new Mammal("Pet");
        System.out.println(mammal);
    }
}
