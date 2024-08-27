package hus.oop.exam2.matrix;

import java.util.Arrays;

public class Matrix {
    private double[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong đoạn [1, 10]
     * @param rows số hàng, columns số cột
     */
    public Matrix(int rows, int columns) {
        /* TODO */
        initRandom(rows, columns);
    }

    public Matrix(double[][] doubles) {
        this.data = doubles;
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong đoạn [1, 10]
     * @param rows số hàng, columns số cột
     */
    private void initRandom(int rows, int columns) {
        /* TODO */
        data = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = Math.round((Math.random() * 10) * 10) / 10;
            }
        }
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public double get(int row, int col) {
        /* TODO */
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, double value) {
        /* TODO */
        data[row][col] = value;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public Matrix getSortedMatrix() {
        /* TODO */
        double[] array = change2DTo1D(this.data);
        Arrays.sort(array);

        return new Matrix(change1DTo2D(array));
    }

    public double[][] getData() {
        return data;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public Matrix add(Matrix that) {
        /* TODO */
        if (!isChecked(that)) {
            throw new ArrayStoreException();
        }

        double[][] currentData = new double[this.data.length][this.data[0].length];

        for (int i = 0; i < currentData.length; i++) {
            for (int j = 0; j < currentData[i].length; j++) {
                currentData[i][j] = this.data[i][j] + that.get(i, j);
            }
        }

        return new Matrix(currentData);
    }

    public boolean isChecked(Matrix another) {
        if (another.getData().length == this.data.length
                && another.getData()[0].length == this.data[0].length) {
            return true;
        }

        return false;
    }

    public double[] change2DTo1D(double[][] array) {
        double[] arr = new double[array.length * array[0].length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr[count++] = array[i][j];
            }
        }

        return arr;
    }

    public double[][] change1DTo2D(double[] array) {
        double[][] array2D = new double[this.data.length][this.data[0].length];
        int count = 0;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = array[count++];
            }
        }

        return array2D;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public Matrix minus(Matrix that) {
        /* TODO */
        if (!isChecked(that)) {
            throw new ArrayStoreException();
        }

        double[][] currentData = new double[this.data.length][this.data[0].length];

        for (int i = 0; i < currentData.length; i++) {
            for (int j = 0; j < currentData[i].length; j++) {
                currentData[i][j] = this.data[i][j] - that.get(i, j);
            }
        }

        return new Matrix(currentData);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public Matrix multiply(Matrix that) {
        /* TODO */
        double[][] currentArray = new double[data.length][that.data[0].length];
        for (int i = 0; i < currentArray.length; i++) {
            for (int j = 0; j < currentArray[i].length; j++) {
                double tempSum = 0;

                for (int k = 0; k < data[0].length; k++) {
                    tempSum += data[i][k] + that.get(k, j);
                }

                currentArray[i][j] = tempSum;
            }
        }

        return new Matrix(currentArray);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public Matrix scaled(int value) {
        /* TODO */
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                this.data[i][j] *= value;
            }
        }

        return this;
    }

    /**
     * Phương thức nhân hàng thứ rowIndex của ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận có hàng rowIndex bằng hàng rowIndex của ma trận hiện tại nhân với một số vô hướng.
     */
    public Matrix scaledRow(int value, int rowIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            this.data[rowIndex][i] *= value;
        }

        return null;
    }

    /**
     * Phương thức nhân cột thứ columnIndex của ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận có cột columnIndex bằng cột columnIndex của ma trận hiện tại nhân với một số vô hướng.
     */
    public Matrix scaledColumn(int value, int columnIndex) {
        /* TODO */
        for (int i = 0; i < this.data.length; i++) {
            this.data[i][columnIndex] *= value;
        }

        return this;
    }

    /**
     * Phương thức hoán đổi hai hàng của ma trận.
     * @param firstIndex
     * @param secondIndex
     */
    public void swapRows(int firstIndex, int secondIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            double temp = this.data[firstIndex][i];
            this.data[firstIndex][i] = this.data[secondIndex][i];
            this.data[secondIndex][i] = temp;
        }
    }

    /**
     * Phương thức hoán đổi hai cột của ma trận.
     * @param firstIndex
     * @param secondIndex
     */
    public void swapColumns(int firstIndex, int secondIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            double temp = this.data[i][firstIndex];
            this.data[i][firstIndex] = this.data[i][secondIndex];
            this.data[i][secondIndex] = temp;
        }
    }

    /**
     * Phương thức cộng hàng destIndex của ma trận với hàng sourceIndex của ma trận được nhân với một số value.
     * @param value
     * @param sourceIndex
     * @param destIndex
     */
    public void addRow(double value, int sourceIndex, int destIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            this.data[destIndex][i] += this.data[sourceIndex][i] * value;
        }
    }

    /**
     * Phương thức cộng cột destIndex của ma trận với cột sourceIndex của ma trận được nhân với một số value.
     * @param value
     * @param sourceIndex
     * @param destIndex
     */
    public void addColumn(double value, int sourceIndex, int destIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            this.data[i][destIndex] += this.data[i][sourceIndex] * value;
        }
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public Matrix transpose() {
        /* TODO */
        double[][] currentMatrix = new double[this.data[0].length][this.data.length];

        for (int i = 0; i < currentMatrix.length; i++) {
            for (int j = 0; j < currentMatrix[i].length; j++) {
                currentMatrix[i][j] = this.data[j][i];
            }
        }

        return new Matrix(currentMatrix);
    }

    /**
     * Phương thức lấy ra ma trận dạng hình thang theo hàng (row echelon form)
     * sau khi thực hiện phép khử Gauss.
     * @return ma trận dạng hình thang theo hàng.
     */
    public Matrix gaussianElimination() {
        /* TODO */
        return null;
    }

    /**
     * Phương thức lấy ra ma trận dạng hình thang theo hàng rút gọn (reduced row echelon form)
     * sau khi thực hiện phép khử Gauss-Jordan
     * @return
     */
    public Matrix gaussJordanElimination() {
        /* TODO */
        return null;
    }

    /**
     * Biểu diễn ma trận theo định dạng
     * a11 a12 ... a1n
     * a21 a22 ... a2n
     * ...
     * am1 am2 ... amn
     * @return một chuỗi biểu diễn ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                stringBuilder.append(this.data[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
