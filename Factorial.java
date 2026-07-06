package methodAssignment;

public class Factorial {

      public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

        public static void main(String[] args) {

        Factorial obj = new Factorial();

        int num = 10; // hardcoded value

        long result = obj.factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}

