package hus.oop.design_patterns.lab10.strategy.sort;

public class Sort {
    private Algorithm algorithm;
    private int[] data;

    public Sort(Algorithm algorithm, int[] data) {
        this.algorithm = algorithm;
        this.data = data;
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sortData() {
        algorithm.sort(data);
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void printData() {
        for (int dat : data) {
            System.out.print(dat + "\t");
        }
        System.out.println();
    }
}
