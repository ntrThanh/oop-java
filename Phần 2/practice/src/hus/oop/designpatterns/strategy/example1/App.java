package hus.oop.designpatterns.strategy.example1;

public class App {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 6, 2, -23, 23, 1, 55, -43, 10, 23};
        StrategyAlgorithms strategyAlgorithms = new StrategyAlgorithms(new BubbleSort(), data);
        strategyAlgorithms.sort();
        data = strategyAlgorithms.getData();
        printArray(data);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
