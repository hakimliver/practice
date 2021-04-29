package ArrayPractice;

import java.util.Scanner;

public class bestExercise {

// write a program that build a matrix of 5 rows and 3 columns.
// ask the user to enter the values for all the matrix ,
//print out the sum of all matrix items

    static Scanner hakim = new Scanner(System.in);
    public static void main(String[] args) {


        int [][]matrix=new int [5][3];

        fillArray(matrix);
        System.out.println("array filled ");

        System.out.println("the array will be printed ");
        printArray(matrix);

        System.out.println("the array will be summed ");
        int total=sumArray(matrix);
        System.out.println(total);
    }


    public static void fillArray(int[][]list)
    {
        for(int row=0;row< list.length;row++)
            for(int col=0;col< list.length;col++)
            {
                System.out.println("enter data for row nbr "+ (row+1)+"enter column nbr "+(col+1));
                list[row][col]=hakim.nextInt();

            }

    }
    public static void printArray(int[][]list)
    {
        for(int row=0;row<list.length;row++)
            for (int col=0;col<list[0].length;col++)
            {
                System.out.println(list[row][col]);
            }

    }

    public static int sumArray(int[][]list)
    {
        int sum=0;
        for(int row=0;row<list.length;row++)
            for (int col=0;col<list[0].length;col++)
            {
                sum += list[row][col];

            }
        return sum;
    }


}
