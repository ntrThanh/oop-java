package hus.oop.design_patterns.lab10.strategy.pseudocode;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyAdd());

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        sc.nextLine();
        int secondNumber = sc.nextInt();
        sc.nextLine();

        String action = sc.nextLine();
        if (action.equals("sub")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equals("multi")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else if (action.equals("add")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else {
            System.out.println("error");
            return;
        }

        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println(result);
    }
}
