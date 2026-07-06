package methodAssignment;

import java.util.Scanner;

public class ProductOfTwoNumber {
    
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        ProductOfTwoNumber obj = new ProductOfTwoNumber();

        double result = obj.multiply(num1, num2);

        // Display result
        System.out.println("Product is: " + result);
    }
}
