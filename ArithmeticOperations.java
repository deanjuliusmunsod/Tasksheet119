import java.util.Scanner;

public class ArithmeticOperations {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static String divide(double a, double b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Error: Division by zero is not allowed.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sumResult = add(num1, num2);
        double subtractResult = subtract(num1, num2);
        double multiplyResult = multiply(num1, num2);
        String divideResult = divide(num1, num2);

        // Print results
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sumResult);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtractResult);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplyResult);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + divideResult);

        scanner.close();
    }
}


