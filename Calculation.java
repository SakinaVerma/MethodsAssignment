package methodAssignment;

import java.util.Scanner;

import exceptionHandling.Calculator;

public class Calculation {

    
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        // if (b == 0) {
        //     System.out.println("Division by zero is not allowed.");
        //     return 0;
        //}
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Create object to call non-static methods
        Calculation obj = new Calculation();

        // Calling methods
        System.out.println("Addition: " + obj.add(num1, num2));
        System.out.println("Subtraction: " + obj.subtract(num1, num2));
        System.out.println("Multiplication: " + obj.multiply(num1, num2));
        System.out.println("Division: " + obj.divide(num1, num2));
    }
}