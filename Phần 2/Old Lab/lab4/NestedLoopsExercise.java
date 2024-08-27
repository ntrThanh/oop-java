package lab4;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testSquarePattern(sc);
        // testCheckerPattern(sc);
        // testTimeTable(sc);
        // testTriangularPatternX(sc);
        // testBoxPatternX(sc);
        // testHillPatternX(sc);
    }

    public static void squarePattern(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testSquarePattern(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        squarePattern(size);
    }

    public static void checkerPattern(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern(Scanner sc) {
        System.out.println("Enter th size: ");
        int size = sc.nextInt();
        checkerPattern(size);
    }

    public static void timeTable(int number) {
        System.out.print(" * |");
        for (int i = 1; i <= number; i++) {
            System.out.printf("   %4d", i);
        }
        System.out.println();
        System.out.print("----");
        for (int i = 1; i <= number; i++) {
            System.out.print("-------");
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%2d ", i);
            System.out.print("|");
            for (int j = 1; j <= number; j++) {
                System.out.printf("   %4d", (i * j));
            }
            System.out.println();
        }
    }

    public static void testTimeTable(Scanner sc) {
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        timeTable(number);
    }

    public static void triangularPatternA(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int number) {
        for (int i = 0; i < number; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k != 0) {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < number - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int number) {
        for (int i = 0; i < number; i++) {
            for (int k = 0; k < number - i - 1; k++) {
                if (i != number - 1) {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testTriangularPatternX(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        triangularPatternA(size);
        System.out.println();
        triangularPatternB(size);
        System.out.println();
        triangularPatternC(size);
        System.out.println();
        triangularPatternD(size);
        System.out.println();
    }

    public static void boxPatternA(int number) {
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == number - 1) {
                for (int j = 0; j < number; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < number; k++) {
                    if (k == 0 || k == number - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void boxPatternB(int number) {
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == number - 1) {
                for (int j = 0; j < number; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < number; k++) {
                    if (k == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void boxPatternC(int number) {
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == number - 1) {
                for (int j = 0; j < number; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < number; k++) {
                    if (k == number - i - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void boxPatternD(int number) {
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == number - 1) {
                for (int j = 0; j < number; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < number; k++) {
                    if (k == number - i - 1 || k == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void testBoxPatternX(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println();
        boxPatternA(size);
        System.out.println();
        boxPatternB(size);
        System.out.println();
        boxPatternC(size);
        System.out.println();
        boxPatternD(size);
    }

    public static void hillPatternA(int number) {
        int count = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < count; k++) {
                System.out.print("# ");
            }
            count += 2;
            System.out.println();
        }
    }

    public static void hillPatternB(int number) {
        int numberOfHashes = 1 + (number - 1) * 2; // sử dụng cấp số cộng với công sai d = 2, số phần tử là number
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < numberOfHashes; k++) {
                System.out.print("# ");
            }
            numberOfHashes -= 2;
            System.out.println();
        }
    }

    public static void hillPatternC(int number) {
        hillPatternA(number);
        number -= 1;
        int numberOfHashes = 1 + (number - 1) * 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < numberOfHashes; k++) {
                System.out.print("# ");
            }
            numberOfHashes -= 2;
            System.out.println();
        }
    }

    public static void hillPatternD(int number) {
        int numberOfHashes = 1 + (number - 1) * 2;
        int count = 1;
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                for (int j = 0; j < numberOfHashes; j++) {
                    System.out.print("# ");
                }
            } else {
                for (int j = 0; j < numberOfHashes; j++) {
                    if (j < (numberOfHashes + count) / 2 && j >= (numberOfHashes - count) / 2) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
                    }
                }
                count += 2;
            }
            System.out.println();
        }
        count -= 4;
        for (int i = 0; i < number - 1; i++) {
            if (i == number - 2) {
                for (int j = 0; j < numberOfHashes; j++) {
                    System.out.print("# ");
                }
            } else {
                for (int j = 0; j < numberOfHashes; j++) {
                    if (j < (numberOfHashes + count) / 2 && j >= (numberOfHashes - count) / 2) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
                    }
                }
                count -= 2;
            }
            System.out.println();
        }
    }

    public static void testHillPatternX(Scanner sc) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println();
        hillPatternA(size);
        System.out.println();
        hillPatternB(size);
        System.out.println();
        hillPatternC(size);
        System.out.println();
        hillPatternD(size);
    }
}