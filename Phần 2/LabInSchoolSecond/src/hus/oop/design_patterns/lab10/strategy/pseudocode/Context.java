package hus.oop.design_patterns.lab10.strategy.pseudocode;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
