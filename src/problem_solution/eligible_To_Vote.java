package problem_solution;

public class eligible_To_Vote {

    /**
     * write a programme to verify if user is eligible to vote or not
     *
     * nb:from 18 years old user can vote
     *
     */

    public static void main(String[] args) {
        eligibility(17);
    }

    public static void eligibility(int age){
        if (age>=18)
            System.out.println("eligible to vote ");
        else
            System.out.println("you are under 18 !,go back home");
    }


}
