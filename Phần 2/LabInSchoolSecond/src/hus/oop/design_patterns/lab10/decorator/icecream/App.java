package hus.oop.design_patterns.lab10.decorator.icecream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<IceCream> list = new ArrayList<>();
        list.add(new VanillaIceCream());
        list.add(new HoneyToppingDecorator(new HoneyToppingDecorator(new VanillaIceCream())));
        list.add(new HoneyToppingDecorator(new ChocolateIceCream()));
        list.add(new StrawberryIceCream());

        for (IceCream iceCream : list) {
            System.out.println(iceCream.getDescription());
        }
    }
}
