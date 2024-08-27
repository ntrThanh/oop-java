package hus.oop.designpatterns.decorator.example;

public class Application {
    public static void main(String[] args) {
        IceCream iceCream = new FirstTopping(new SecondTopping(new ChocoLateIceCream()));
        System.out.println(iceCream.getDescription());
    }
}
