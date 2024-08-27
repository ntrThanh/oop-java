package hus.oop.lab7.secondanimal;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow");
    }

    public void greeting(BigDog anotherDog) {
        System.out.println("Wooooooow");
    }
}
