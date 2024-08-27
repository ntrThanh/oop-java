package hus.oop.exam2.rootsolver;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testRootSolver();
    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        UnivariateRealRootFinding univariateRealRootFinding =
                new UnivariateRealRootFinding(new UnivariateRealFunction(),
                        new BisectionSolver(0.000001, 100));
        System.out.println("solve x.sin(x) - 3 = 0 using bisection solver about [12 - 14], the experience is: "
                + univariateRealRootFinding.solve(12, 14));
        univariateRealRootFinding.setRootSolver(new NewtonRaphsonSolver(0.00001, 100));
        System.out.println("solve x.sin(x) - 3 = 0 using newton raphson solver about [12 - 14], the experience is: "
                + univariateRealRootFinding.solve(12, 14));
        univariateRealRootFinding.setRootSolver(new SecantSolver(0.000001, 100));
        System.out.println("solve x.sin(x) - 3 = 0 using secant solver about [12 - 14], the experience is: "
                + univariateRealRootFinding.solve(12, 14));

        System.out.println();
        univariateRealRootFinding.setPoly(new OtherFunction());
        System.out.println("solve x ^ 2 - 169 = 0 using bisection solver about [12 - 14], the experience is: "
                + univariateRealRootFinding.solve(12, 14));
        univariateRealRootFinding.setRootSolver(new NewtonRaphsonSolver(0.00001, 100));
        System.out.println("solve x ^ 2 - 169 = 0 using newton raphson solver about [12 - 14], the experience is: "
                + univariateRealRootFinding.solve(12, 14));
        univariateRealRootFinding.setRootSolver(new SecantSolver(0.000001, 100));
        System.out.println("solve x ^ 2 - 169 = 0 using secant solver about [12 - 14], the experience is: "
                + univariateRealRootFinding.solve(12, 14));
    }
}
