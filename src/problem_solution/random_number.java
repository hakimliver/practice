package problem_solution;

import java.util.Random;

public class random_number {


    public static void main(String[] args) {


        Random rand=new Random();
       int num= rand.nextInt(10);
        System.out.println(num);
    }

}
