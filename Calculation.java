package methodassignment;

import java.util.Scanner;

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

        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Calculation obj = new Calculation();

        System.out.println("Addition: " + obj.add(num1, num2));
        System.out.println("Subtraction: " + obj.subtract(num1, num2));
        System.out.println("Multiplication: " + obj.multiply(num1, num2));
        System.out.println("Division: " + obj.divide(num1, num2));
        sc.close();
    }
}