package ArrayPractice;

import java.util.Random;
import java.util.Scanner;

public class goodExercice_6 {

    Scanner input=new Scanner(System.in) ;
    public static void main(String[] args) {
        int[][] abc=new int[5][3];
        fillArray(abc);
        printArray(abc);
       int total= sumArray(abc);
        System.out.println("the sum is "+total);

    }


    public static void fillArray(int[][] name) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < name.length; row++)
            for (int col = 0; col < name[0].length; col++) {
                System.out.println("enter data for row number " + (row + 1) + " and column number " + (col + 1));
                name[row][col] = input.nextInt();
            }
    }



    public static void printArray(int[][] list) {

        for (int row = 0; row < list.length; row++)
             for (int col=0;col<list[row].length;col++) {

                 System.out.println(list[row][col]);
             }
    }



    public static int sumArray(int[][] list) {
         int sum=0;
        for (int row = 0; row < list.length; row++)
            for (int col=0;col<list[row].length;col++) {

              sum+=  (list[row][col]);
            }
        return sum;
    }
}
