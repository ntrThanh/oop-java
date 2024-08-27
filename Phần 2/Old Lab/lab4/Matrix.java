package lab4;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testPrintMatrix(sc);
        printMatrix(addMatrix(testPrintMatrix(sc), testPrintMatrix(sc)));
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] testPrintMatrix(Scanner sc) {
        System.out.println("Enter row: ");
        int rows = sc.nextInt();
        System.out.println("Enter colums");
        int colums = sc.nextInt();
        int[][] matrix = new int[rows][colums];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] outMatrix = new int[matrix1.length][matrix2.length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < outMatrix.length; i++) {
                for (int j = 0; j < outMatrix[i].length; j++) {
                    outMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return outMatrix;
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] outMatrix = new double[matrix1.length][matrix2.length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < outMatrix.length; i++) {
                for (int j = 0; j < outMatrix[i].length; j++) {
                    outMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return outMatrix;
    }

    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] outMatrix = new int[matrix1.length][matrix2.length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < outMatrix.length; i++) {
                for (int j = 0; j < outMatrix[i].length; j++) {
                    outMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return outMatrix;
    }

    public static double[][] subtractMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] outMatrix = new double[matrix1.length][matrix2.length];

        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < outMatrix.length; i++) {
                for (int j = 0; j < outMatrix[i].length; j++) {
                    outMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return outMatrix;
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newMatrix;
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        double[][] newMatrix = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newMatrix;
    }
}
