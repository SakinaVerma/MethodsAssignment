package methodAssignment;

import java.util.Scanner;

public class AreaOfCircle {


    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = area(radius);
        double circ = circumference(radius);

        System.out.println("Area of Circle = " + area);
        System.out.println("Circumference of Circle = " + circ);

        sc.close();
    }
}