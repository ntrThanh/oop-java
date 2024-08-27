package hus.oop.exam1.matrix;

import java.util.ArrayList;
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
            for(int j = 0; j < size; j++) {
                data[i][j] = (int) (Math.random() * 100);
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

        for(int i = 0; i < data.length; i++) {
            resultData[i] = data[i][i];
        }

        return resultData;
    }

    public int getSize() {
        return data.length;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int[] resultData = new int[data.length];

        for(int i = 0; i < data.length; i++) {
            resultData[i] = data[data.length - i - 1][i];
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
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                if (isPrime(data[i][j])) {
                    list.add(data[i][j]);
                }
            }
        }

        int[] resultData = new int[list.size()];
        for(int i = 0; i < resultData.length; i++) {
            resultData[i] = list.get(i);
        }
        return resultData;
    }

    // check number is prime;
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for(int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
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
        int[] currentData = changeArray2DTo1D(data);
        sortArray(currentData);
        return new SquareMatrix(changeArray1Dto2D(currentData));
    }

    public int[][] changeArray1Dto2D(int[] data1D) {
        int[][] newData = new int[data.length][data.length];
        int count1 = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                newData[i][j] = data1D[count1++];
            }
        }

        return newData;
    }

    public int[] changeArray2DTo1D(int[][] data) {
        int[] currentData = new int[data.length * data.length];
        int count = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                currentData[count++] = data[i][j];
            }
        }

        return currentData;
    }

    public void sortArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        /* TODO */
        if (row > data.length || col > data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

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
        if (row > data.length || col > data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) throws Exception {
        /* TODO */
        if (data.length != that.getSize()) {
            throw new Exception("can not add");
        }

        int[][] result = new int[data.length][data.length];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = this.get(i, j) + that.get(i, j);
            }
        }

        return new SquareMatrix(result);
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) throws Exception {
        /* TODO */
        if (data.length != that.getSize()) {
            throw new Exception("can not add");
        }

        int[][] result = new int[data.length][data.length];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = this.get(i, j) - that.get(i, j);
            }
        }

        return new SquareMatrix(result);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        /* TODO */
        int[][] result = new int[data.length][data.length];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                int temp = 0;
                for(int k = 0; k < result.length; k++) {
                    temp += get(i, k) * that.get(k, j);
                }

                result[i][j] = temp;
            }
        }

        return new SquareMatrix(result);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        /* TODO */
        int[][] result = new int[data.length][data.length];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = this.get(i, j) * value;
            }
        }

        return new SquareMatrix(result);
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        /* TODO */
        int[][] result = new int[data.length][data.length];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = data[j][i];
            }
        }

        return new SquareMatrix(result);
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
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                resultString.append(data[i][j] + "  ");
            }
            resultString.append("\n");
        }

        return resultString.toString();
    }

    public static void printArray1D(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
