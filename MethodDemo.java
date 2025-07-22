public class MethodDemo {

    public static void main(String[] args) {
        printMessage();

        int sumTwo = calculateSum(5, 7);
        System.out.println("Sum of two numbers: " + sumTwo);

        int sumThree = calculateSum(10, 10, 10);
        System.out.println("Sum of three numbers: " + sumThree);

        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }

    public static void printMessage() {
        System.out.println("Hello, World!");
    }

    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int calculateSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
