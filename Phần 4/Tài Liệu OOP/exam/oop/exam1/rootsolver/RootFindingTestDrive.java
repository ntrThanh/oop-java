package hus.oop.exam1.rootsolver;

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
        RootSolver rootSolver = new BisectionSolver(0.0001, 100);
        UnivariateRealRootFinding univariateRealRootFinding =
                new UnivariateRealRootFinding(new UnivariateRealFunction(), rootSolver);
        System.out.println("find x in the function about 12 - 14 " +
                "by bisection solver: x * sin(x) - 3 = 0 >> x = " +
                univariateRealRootFinding.solve(12, 14));
        univariateRealRootFinding.setRootSolver(new NewtonRaphsonSolver(0.0001, 100));
        System.out.println("find x in the function about 12 - 14 " +
                "by newton raphson solver: x * sin(x) - 3 = 0 >> x = " +
                univariateRealRootFinding.solve(12, 14));
        univariateRealRootFinding.setRootSolver(new SecantSolver(0.0001, 100));
        System.out.println("find x in the function about 12 - 14 " +
                "by newton secant solver: x * sin(x) - 3 = 0 >> x = " +
                univariateRealRootFinding.solve(12, 14));
        System.out.println();

        univariateRealRootFinding.setPoly(new NewFunction());
        univariateRealRootFinding.setRootSolver(new BisectionSolver(0.0001, 100));
        System.out.println("find x in the function about 1 - 2 " +
                "by bisection solver: x ^ 2 = 0 >> x = " +
                univariateRealRootFinding.solve(1, 2));
        univariateRealRootFinding.setRootSolver(new NewtonRaphsonSolver(0.0001, 100));
        System.out.println("find x in the function about 1 - 2 " +
                "by newton raphson solver: x ^ 2 = 0 >> x = " +
                univariateRealRootFinding.solve(1, 2));
        univariateRealRootFinding.setRootSolver(new SecantSolver(0.0001, 100));
        System.out.println("find x in the function about 1 - 2 " +
                "by secant solver: x ^ 2 = 0 >> x = " +
                univariateRealRootFinding.solve(1, 2));
    }
}
