package hus.oop.exam1.matrix;

public class SquareMatrixTestDrive {
    public static void main(String[] args) throws Exception {
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
        SquareMatrix squareMatrix1 = new SquareMatrix(3);

        // in hai ma tran
        System.out.println(squareMatrix);
        System.out.println(squareMatrix1);

        // in phan tu tren duong cheo chinh va phu
        SquareMatrix.printArray1D(squareMatrix.principalDiagonal());
        SquareMatrix.printArray1D(squareMatrix1.principalDiagonal());
        System.out.println();

        // cong tru nhan chia ma tran
        System.out.println(squareMatrix.add(squareMatrix1));
        System.out.println(squareMatrix.minus(squareMatrix1));
        System.out.println(squareMatrix.multiply(squareMatrix1));

        // in ra so nguyen to cua ma tran
        SquareMatrix.printArray1D(squareMatrix.primes());
        System.out.println();

        // in ra ma tran sau khi sap xep
        System.out.println(squareMatrix.getSortedMatrix());

    }
}
