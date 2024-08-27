package hus.oop.design_patterns.lab10.strategy.pseudocode;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
