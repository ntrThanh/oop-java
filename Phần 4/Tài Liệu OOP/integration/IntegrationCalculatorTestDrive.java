package hus.oop.exam3.integration;

import java.util.List;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        System.out.println("ARRAY");
        double x = 2.0;
        ArrayPolynomial polynomial =
                new ArrayPolynomial(new double[] {1, 2, 3, 6, 2, 8});
        ArrayPolynomial polynomial1 =
                new ArrayPolynomial(new double[] {1, 0, 3, 6, 2, 8, 0, 1, 2});
        System.out.println("poly 1: " + polynomial);
        System.out.println("poly 2: " + polynomial1);
        System.out.println("poly 1 with x = " + x +
                " >> poly(" + x + ") = " + polynomial.evaluate(x));
        System.out.println("poly 1 + poly 2: " + polynomial.plus(polynomial1));
        System.out.println("poly 1 - poly 2: " + polynomial.minus(polynomial1));
        System.out.println("poly 1: " + polynomial);
        System.out.println("poly 2: " + polynomial1);
        System.out.println("poly1 * poly 2: " + polynomial.multiply(polynomial1));
        System.out.println();
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        System.out.println("LIST");
        double x = 2.0;
        ListPolynomial polynomial = new ListPolynomial();
        ListPolynomial polynomial1 =
                new ListPolynomial(List.of(1.0, 3.0, 9.0, 3.0, 0.0, -10.0));
        polynomial = polynomial.append(1.0);
        polynomial = polynomial.append(2.0);
        polynomial = polynomial.append(9.0);
        polynomial = polynomial.append(0.0);
        polynomial = polynomial.append(3.0);
        System.out.println("poly 1: " + polynomial);
        System.out.println("poly 2: " + polynomial1);
        System.out.println("poly 1 with x = " + x +
                " >> poly(" + x + ") = " + polynomial.evaluate(x));
        System.out.println("poly 1 + poly 2: " + polynomial.plus(polynomial1));
        System.out.println("poly 1 - poly 2: " + polynomial.minus(polynomial1));
        System.out.println("poly 1: " + polynomial + " " + polynomial.degree());
        System.out.println("poly 2: " + polynomial1 + " " + polynomial1.degree());
        System.out.println("poly1 * poly 2: " + polynomial.multiply(polynomial1));
        System.out.println();
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        System.out.println("INTEGRATION");
        Polynomial polynomial = new ArrayPolynomial(new double[] {1, 2, 3});
        IntegrationCalculator integrationCalculator =
                new IntegrationCalculator(new MidpointRule(0.001, 100), polynomial);
        System.out.println(polynomial +  " about 0 - 5 has integral is: "
                + integrationCalculator.integrate(0, 5) + " using mid rule");
        integrationCalculator.setIntegrator(new SimpsonRule(0.001, 100));
        System.out.println(polynomial +  " about 0 - 5 has integral is: "
                + integrationCalculator.integrate(0, 5) + " using simpson rule");
        integrationCalculator.setIntegrator(new TrapezoidRule(0.001, 100));
        System.out.println(polynomial +  " about 0 - 5 has integral is: "
                + integrationCalculator.integrate(0, 5) + " using trapezoid rule");
    }
}
