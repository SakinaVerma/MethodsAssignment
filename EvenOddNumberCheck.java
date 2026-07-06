package methodAssignment;

public class EvenOddNumberCheck {

    public static boolean isEven(int a) {

        // int a = 10;
        if (a % 2 == 0) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        boolean result = EvenOddNumberCheck.isEven(10);

        System.out.println(result);

    }

}
