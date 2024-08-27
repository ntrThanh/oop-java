package hus.oop.exam3.matrix;

public class Matrix {
    private double[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong đoạn [1, 10]
     *
     * @param rows số hàng, columns số cột
     */
    public Matrix(int rows, int columns) {
        /* TODO */
        data = new double[rows][columns];
        this.initRandom(rows, columns);
    }

    public Matrix(double[][] data) {
        this.data = data;
    }

    public int getNumberOfRow() {
        return data.length;
    }

    public int getNumberOfColum() {
        return data[0].length;
    }
    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong đoạn [1, 10]
     *
     * @param rows số hàng, columns số cột
     */
    private void initRandom(int rows, int columns) {
        /* TODO */
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = (Math.random()) * 10;
            }
        }
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     *
     * @param row
     * @param col
     * @return
     */
    public double get(int row, int col) {
        /* TODO */
        return this.data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     *
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, double value) {
        /* TODO */
        this.data[row][col] = value;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     *
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public Matrix getSortedMatrix() {
        /* TODO */
        double[] array = changeArray2DTo1D(data);
        sort(array);

        return new Matrix(changeArray1DTo2D(array));
    }

    public double[] changeArray2DTo1D(double[][] array) {
        double[] result = new double[array.length * array[0].length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[count++] = array[i][j];
            }
        }

        return result;
    }

    public void sort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public double[][] changeArray1DTo2D(double[] array) {
        double[][] result = new double[data.length][data[0].length];
        int count = 0;

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                result[i][j] = array[count++];
            }
        }

        return result;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public Matrix add(Matrix that) {
        /* TODO */
        double[][] resultMatrix = new double[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                resultMatrix[i][j] = this.data[i][j] + get(i, j);
            }
        }

        return new Matrix(resultMatrix);
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public Matrix minus(Matrix that) {
        /* TODO */
        double[][] resultMatrix = new double[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                resultMatrix[i][j] = this.data[i][j] - that.get(i, j);
            }
        }

        return new Matrix(resultMatrix);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public Matrix multiply(Matrix that) {
        /* TODO */
        if (this.getNumberOfColum() != that.getNumberOfRow()) {
            return null;
        }

        double[][] resultMatrix = new double[this.getNumberOfRow()][that.getNumberOfColum()];

        for(int i = 0; i < resultMatrix.length; i++) {
            for(int j = 0; j < resultMatrix[i].length; j++) {
                double term = 0;

                for(int k = 0; k < this.getNumberOfColum(); k++) {
                    term += this.data[i][k] * that.get(k, i);
                }

                resultMatrix[i][j] = term;
            }
        }

        return new Matrix(resultMatrix);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public Matrix scaled(int value) {
        /* TODO */
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                this.data[i][j] = this.data[i][j] * value;
            }
        }

        return this;
    }

    /**
     * Phương thức nhân hàng thứ rowIndex của ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận có hàng rowIndex bằng hàng rowIndex của ma trận hiện tại nhân với một số vô hướng.
     */
    public Matrix scaledRow(int value, int rowIndex) {
        /* TODO */
        double[][]  resultMatrix = new double[this.data.length][this.data[0].length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                resultMatrix[i][j] = data[i][j];
            }
        }

        for(int i = 0; i < resultMatrix[0].length; i++) {
            resultMatrix[rowIndex][i] = resultMatrix[rowIndex][i] * value;
        }

        return new Matrix(resultMatrix);
    }

    /**
     * Phương thức nhân cột thứ columnIndex của ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận có cột columnIndex bằng cột columnIndex của ma trận hiện tại nhân với một số vô hướng.
     */
    public Matrix scaledColumn(int value, int columnIndex) {
        /* TODO */
        double[][]  resultMatrix = new double[this.data.length][this.data[0].length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                resultMatrix[i][j] = data[i][j];
            }
        }

        for(int i = 0; i < resultMatrix.length; i++) {
            resultMatrix[i][columnIndex] = resultMatrix[i][columnIndex] * value;
        }

        return new Matrix(resultMatrix);
    }

    /**
     * Phương thức hoán đổi hai hàng của ma trận.
     *
     * @param firstIndex
     * @param secondIndex
     */
    public void swapRows(int firstIndex, int secondIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            double temp = data[firstIndex][i];
            data[firstIndex][i] = data[secondIndex][i];
            data[secondIndex][i] = temp;
        }
    }

    /**
     * Phương thức hoán đổi hai cột của ma trận.
     *
     * @param firstIndex
     * @param secondIndex
     */
    public void swapColumns(int firstIndex, int secondIndex) {
        /* TODO */
        for(int i = 0; i < data.length; i++) {
            double temp = data[i][firstIndex];
            data[i][firstIndex] = data[i][secondIndex];
            data[i][secondIndex] = temp;
        }
    }

    /**
     * Phương thức cộng hàng destIndex của ma trận với hàng sourceIndex của ma trận được nhân với một số value.
     *
     * @param value
     * @param sourceIndex
     * @param destIndex
     */
    public void addRow(double value, int sourceIndex, int destIndex) {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            this.data[destIndex][i] = this.data[destIndex][i] + this.data[sourceIndex][i] * value;
        }
    }

    /**
     * Phương thức cộng cột destIndex của ma trận với cột sourceIndex của ma trận được nhân với một số value.
     *
     * @param value
     * @param sourceIndex
     * @param destIndex
     */
    public void addColumn(double value, int sourceIndex, int destIndex) {
        /* TODO */
        for (int i = 0; i < this.data.length; i++) {
            this.data[i][destIndex] += this.data[i][sourceIndex] * value;
        }
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     *
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public Matrix transpose() {
        /* TODO */
        double[][] resultData = new double[this.data[0].length][this.data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                resultData[i][j] = this.data[j][i];
            }
        }

        return new Matrix(resultData);
    }

    /**
     * Phương thức lấy ra ma trận dạng hình thang theo hàng (row echelon form)
     * sau khi thực hiện phép khử Gauss.
     *
     * @return ma trận dạng hình thang theo hàng.
     */
    public Matrix gaussianElimination() {
        /* TODO */
        for (int i = 0; i < this.data[0].length; i++) {
            int count = this.data.length - i;
            int count2 = this.data.length;
            while (count != 0) {
                addRow(- this.data[count][i] / this.data[count2--][i], count - 1, i);
                count--;
            }
        }

        return this;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        System.out.println(matrix);
        Matrix matrix1 = new Matrix(3, 4);
        System.out.println(matrix1);
        System.out.println();

        System.out.println(matrix.getSortedMatrix());
        System.out.println();
        System.out.println(matrix.minus(matrix1));
    }

    /**
     * Phương thức lấy ra ma trận dạng hình thang theo hàng rút gọn (reduced row echelon form)
     * sau khi thực hiện phép khử Gauss-Jordan
     *
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
     *
     * @return một chuỗi biểu diễn ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[i].length; j++) {
                resultString.append(this.data[i][j]).append("  ");
            }
            resultString.append("\n");
        }

        return resultString.toString();
    }
}
