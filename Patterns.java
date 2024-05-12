public class Patterns {
    static int n = 5;

    // Pyramid
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static void pyramid() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // print space
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
    }

    // Right Triangle Star Patterns
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static void rightTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // left triangle pattern
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static void leftTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Diamond Pattern
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    private static void diamondPattern() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Downward Triangle pattern
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    private static void downwardTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Mirrored right triangle
    // *
    // **
    // ***
    // ****
    // *****
    private static void mirroredRightTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Reversed Pyramid Star Pattern
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    private static void reversedPyramid() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (n - i) + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Right down Mirror Star Pattern
    // *****
    // ****
    // ***
    // **
    // *
    private static void rightDownMirror() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Right Pascal’s Triangle
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    private static void rightPascalTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Left Triangle Pascal’s
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    private static void leftPascalTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Sandglass Star Pattern
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static void sandglassPattern() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (n - i) + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Simple number program

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    private static void simpleNumber() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Number Pattern Program

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    private static void numberPattern() {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    // Pascal’s Triangle Program in Java

    private static void pascalTriangle() {
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", val);
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Diamond Pattern
    // 1
    // 212
    // 32123
    // 4321234
    // 32123
    // 212
    // 1

    private static void diamondPatternNumber() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
                if (k == 1) {
                    for (int a = 1; a < i; a++) {
                        System.out.print(a + 1);
                    }
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
                if (k == 1) {
                    for (int a = 1; a < i; a++) {
                        System.out.print(a + 1);
                    }
                }
            }
            System.out.println();
        }
    }

    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5

    private static void numberPattern2() {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k + " ");
            }
            k++;
            System.out.println();
        }
    }

    // 5
    // 5 4
    // 5 4 3
    // 5 4 3 2
    // 5 4 3 2 1

    private static void numberPattern3() {
        for (int i = 0; i < n; i++) {
            int k = n;
            for (int j = 0; j <= i; j++) {
                System.out.print(k-- + " ");
            }
            System.out.println();
        }
    }

    // 1
    // 2 1
    // 3 2 1
    // 4 3 2 1
    // 5 4 3 2 1

    private static void numberPattern4() {
        for (int i = 0; i < n; i++) {
            int k = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k-- + " ");
            }
            System.out.println();
        }
    }

    // Binary Number Pattern

    // 10101
    // 01010
    // 10101
    // 01010
    // 10101

    private static void binaryNumberPattern() {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
                count++;
            }
            System.out.println();
        }
    }

    // Zeros/ ones Pattern Programs

    // 1
    // 10
    // 101
    // 1010
    // 10101

    private static void zeroOnesPattern() {
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j <= i; j++) {
                if (count % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
                count++;
            }
            System.out.println();
        }
    }

    // Sandglass Numeric Pattern

    private static void sandglassNumericPattern() {
        int val = 1;
        for (int i = 0; i < n; i++) {
            int toPrint = val;
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n - i); j++) {
                System.out.print(toPrint++ + " ");
            }
            System.out.println();
            val++;
        }
        val = 5;

        for (int i = 1; i <= n; i++) {
            int toPrint = val;
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int a = val; a <= n; a++) {
                System.out.print(a + " ");
            }
            val--;
            System.out.println();
        }
    }
}