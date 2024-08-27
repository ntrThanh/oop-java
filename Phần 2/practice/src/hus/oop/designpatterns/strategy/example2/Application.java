package hus.oop.designpatterns.strategy.example2;

public class Application {
    public static void main(String[] args) {
        Evaluable evaluable = new Operand(10);
        Evaluable evaluable1 = new Operand(15);
        Evaluable evaluable2 = new Expression(new Operand(12),
                new Expression(evaluable, evaluable1,
                        new MultiplicationOperator()),
                new AdditionOperator());

        System.out.println("12 + 10 * 15 = " + evaluable2.evaluate());
    }
}
