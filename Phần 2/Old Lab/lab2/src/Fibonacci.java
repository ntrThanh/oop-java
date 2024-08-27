public class Fibonacci {
    public static void main(String[] args) {
        printNumberOfFibonacci();
    }
    public static void printNumberOfFibonacci() {
        int number = 3;
        int fn;
        int fnMinus1 = 1; // lấy phần tử đầu tiên
        int fnMinus2 = 1; // lấy phần tử thứ hai

        String stringOfFibonacci = 1 + " " + 1;

        // lấy 20 phần tử đầu tiên của dãy Fibonacci;
        while (number <= 20) {
            int sum = fnMinus1 + fnMinus2;
            fn = sum;
            stringOfFibonacci += " " + fn;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            number++;
        }
        System.out.println(stringOfFibonacci);
    }
}
