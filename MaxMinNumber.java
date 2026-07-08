package methodassignment;

public class MaxMinNumber {

    public static void findMaximumNumber(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println("Maximum number is: " + a);
        } else if (b > c) {

            System.out.println("Maximum number is: " + b);
        } else {
            System.out.println("Maximum number is: " + c);
        }
    }

    public static void findMinimumNumber(int a, int b, int c) {

        if (a < b && a < c) {
            System.out.println("Minimum number is: " + a);
        } else if (b < c) {

            System.out.println("Minimum number is: " + b);
        } else {
            System.out.println("Minimum number is: " + c);
        }
    }

    public static void main(String[] args) {

        MaxMinNumber.findMaximumNumber(10, 5, 90);
        MaxMinNumber.findMinimumNumber(3, 0, 8);

    }

}
