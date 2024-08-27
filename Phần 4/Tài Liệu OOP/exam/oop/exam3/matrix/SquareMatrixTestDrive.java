package hus.oop.exam3.matrix;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        SquareMatrix squareMatrix = new SquareMatrix(3);
        System.out.println("origin matrix");
        System.out.println(squareMatrix);
        System.out.println("transpose");
        System.out.println(squareMatrix.transpose());
        System.out.println("principal diagonal");
        printArray(squareMatrix.principalDiagonal());
        System.out.println("secondary diagonal");
        printArray(squareMatrix.secondaryDiagonal());
        System.out.println();
        System.out.println("matrix 1");
        SquareMatrix squareMatrix1 = new SquareMatrix(3);
        System.out.println(squareMatrix1);
        System.out.println("matrix 2");
        SquareMatrix squareMatrix2 = new SquareMatrix(3);
        System.out.println(squareMatrix2);
        System.out.println("sum");
        System.out.println(squareMatrix.add(squareMatrix1));
        System.out.println("minus");
        System.out.println(squareMatrix.minus(squareMatrix2));
        System.out.println("multi");
        System.out.println(squareMatrix.multiply(squareMatrix1));
        System.out.println("prime");
        printArray(squareMatrix.primes());
    }

    public static void printArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
