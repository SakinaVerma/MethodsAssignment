package methodAssignment;

public class VotingEligibility {

    public static boolean eligiblityForVote(int age) {

        if (age >= 18) {

            return true;

        } else {

            return false;
        }

    }

    public static void main(String[] args) {

        boolean vote = VotingEligibility.eligiblityForVote(20);

        System.out.println(vote);

    }
}
