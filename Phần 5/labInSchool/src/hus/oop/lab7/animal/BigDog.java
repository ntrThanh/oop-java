package hus.oop.lab7.animal;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("woooow");
    }

    public void greets(Dog anotherDog) {
        System.out.println("woooow");
    }

    public void greets(BigDog anotherBigDog) {
        System.out.println("woooooooow");
    }
}
