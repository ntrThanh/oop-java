package hus.oop.exam3.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    public SquareMatrix(int[][] data) {
        this.data = data;
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    private void initRandom(int size) {
        /* TODO */
        data = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = ((int) (Math.random() * 10));
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        int[] resultData = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            resultData[i] = data[i][i];
        }

        return resultData;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int[] resultData = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            resultData[i] = data[i][data.length - i - 1];
        }

        return resultData;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        /* TODO */
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (isPrime(data[i][j])) {
                    list.add(data[i][j]);
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        /* TODO */
        int[] currentArray = changeArrayTo1D();
        Arrays.sort(currentArray);

        return new SquareMatrix(changeArrayTo2D(currentArray));
    }

    private int[] changeArrayTo1D() {
        int[] currentArray = new int[data.length * 2];
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                currentArray[count++] = data[i][j];
            }
        }

        return currentArray;
    }

    private int[][] changeArrayTo2D(int[] array) {
        int[][] resultArray = new int[data.length][data.length];
        int count = 0;

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = array[count++];
            }
        }

        return resultArray;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        /* TODO */
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        /* TODO */
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        /* TODO */
        if (getData().length != that.getData().length) {
            return null;
        }

        int[][] currentArray = new int[data.length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                currentArray[i][j] = data[i][j] + that.get(i, j);
            }
        }

        return new SquareMatrix(currentArray);
    }

    public int[][] getData() {
        return data;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        /* TODO */
        if (getData().length != that.getData().length) {
            return null;
        }

        int[][] currentArray = new int[data.length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                currentArray[i][j] = data[i][j] - that.get(i, j);
            }
        }

        return new SquareMatrix(currentArray);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        /* TODO */
        if (getData().length != that.getData().length) {
            return null;
        }

        int[][] currentArray = new int[data.length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int tempSum = 0;

                for (int k = 0; k < data.length; k++) {
                    tempSum += get(i, k) * that.get(k, j);
                }

                currentArray[i][j] = tempSum;
            }
        }

        return new SquareMatrix(currentArray);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        /* TODO */
        int[][] currentArray = new int[data.length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                currentArray[i][j] = data[i][j] * value;
            }
        }

        return new SquareMatrix(currentArray);
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        /* TODO */
        int[][] currentArray = new int[data.length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                currentArray[i][j] = data[j][i];
            }
        }

        return new SquareMatrix(currentArray);
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     *   1 2 3
     *   4 5 6
     *   7 8 9
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder resultStringArray = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                resultStringArray.append(data[i][j]).append(" ");
            }
            resultStringArray.append("\n");
        }

        return resultStringArray.toString();
    }
}
