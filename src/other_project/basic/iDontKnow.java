package other_project.basic;

public class iDontKnow {

    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        // If age is greater than 18, print "access granted"
        if (age < 18) System.out.println("Access denied - You are not old enough!");
        else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        checkAge(20); // Call the checkAge method and pass along an age of 20
    }









}
