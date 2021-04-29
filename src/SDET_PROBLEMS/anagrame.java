package SDET_PROBLEMS;

import java.util.Arrays;

public class anagrame {


    public static void main(String[] args) {
        String name1 = "race";
        String name2 = "care";

        boolean anangram = checkIfStringsAreAnangram(name1, name2);

        if (anangram) {
            System.out.println("anangram");
        } else {
            System.out.println("not anangram");
        }
    }
    public static boolean checkIfStringsAreAnangram(String name1, String name2) {

        char[] firstArray = name1.toUpperCase().toCharArray();
        char[] secondArray = name2.toUpperCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }


}
