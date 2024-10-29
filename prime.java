import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int fact = factorial(num);
        if (fact != -1) {
            System.out.println("Factorial: " + fact);
        }
    }
}
