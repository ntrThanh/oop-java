package hus.oop.lab7.animal;

public class TestMain {
    public static void main(String[] args) {
        Animal cat = new Cat("My Cat");
        cat.greets();
        System.out.println();

        Animal dog1 = new Dog("My first dog");
        dog1.greets();
        if (dog1 instanceof Dog) {
            ((Dog) dog1).greets(new Dog(""));
        }
        System.out.println();

        Animal bigDog = new BigDog("My Big Dog");
        bigDog.greets();
        if (bigDog instanceof BigDog) {
            ((Dog) bigDog).greets(new Dog(""));
            ((Dog) bigDog).greets();
            ((BigDog) bigDog).greets(new BigDog(""));
        }
    }
}
