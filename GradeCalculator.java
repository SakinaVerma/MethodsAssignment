package methodassignment;

public class GradeCalculator {

    public void displayGrade(int marks) {

        if (marks >= 91 && marks <= 100) {
            System.out.println("He/She is in AA grade");
        } else if (marks >= 81) {
            System.out.println("He/She is in AB grade");
        } else if (marks >= 71) {
            System.out.println("He/She is in BB grade");
        } else if (marks >= 61) {
            System.out.println("He/She is in BC grade");
        } else if (marks >= 51) {
            System.out.println("He/She is in CD grade");
        } else if (marks >= 41) {
            System.out.println("He/She is in DD grade");
        } else {

            System.out.println("fail");

        }
    }

    public static void main(String[] args) {

        GradeCalculator mg = new GradeCalculator();

        mg.displayGrade(10);

    }

}
