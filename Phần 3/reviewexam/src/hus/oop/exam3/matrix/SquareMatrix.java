package hus.oop.exam3.matrix;

public class SquareMatrix extends Matrix {

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong đoạn [1, 10]
     * @param size
     */
    public SquareMatrix(int size) {
        /* TODO */
        super(size, size);
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public double[] principalDiagonal() {
        /* TODO */
        double[] result = new double[this.getNumberOfRow()];
        for(int i = 0; i < result.length; i++) {
            result[i] = this.get(i, i);
        }
        return result;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public double[] secondaryDiagonal() {
        /* TODO */
        double[] result = new double[this.getNumberOfRow()];
        for(int i = 0; i < result.length; i++) {
            result[i] = this.get(i, result.length - 1 - i);
        }
        return result;
    }
}
