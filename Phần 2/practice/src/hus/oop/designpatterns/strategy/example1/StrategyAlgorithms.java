package hus.oop.designpatterns.strategy.example1;

public class StrategyAlgorithms {
    private Algorithms algorithms;
    private int[] data;

    public void sort() {
        algorithms.sort(data);
    }

    public StrategyAlgorithms(Algorithms algorithms) {
        this.algorithms = algorithms;
    }

    public StrategyAlgorithms(Algorithms algorithms, int[] data) {
        this.algorithms = algorithms;
        this.data = data;
    }

    public Algorithms getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(Algorithms algorithms) {
        this.algorithms = algorithms;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}
