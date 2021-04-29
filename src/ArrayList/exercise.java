package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {



        // create a list of unique elements taken from the user
        // then sort and print these elements
        //exp: user enters 1 8 9 2 6 6 1 3 5 5
        // but you print only 1 2 3 5 6 8 9
        ArrayList<Integer>numbers =new ArrayList<>();
        System.out.println("enter 5 numbers ");
        Scanner input =new Scanner(System.in);

        for (int i=0;i<5;i++) {
            int temp = input.nextInt();
            if (!numbers.contains(temp))
                numbers.add(temp);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
