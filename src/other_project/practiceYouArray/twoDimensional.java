package other_project.practiceYouArray;

import java.util.Scanner;

public class twoDimensional {

    // syntax: dataType[][] arrayName= new dataType[rows][cols]

    // exp: the following example declares a two-dimensional
    // array "marks" of 4 rows and 6 columns
    // double[][] marks=new double[4][6]

    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {

        double[][]marks=new double[4][6];
        System.out.println(marks.length);// to get the nbr of rows
        System.out.println(marks[0].length);// to get the nbr of columns




        // initialization of an array
        int[][] hakim={{10,15,20,25},{30,35,40,45},{50,55,60,65}};

        for(int col=0;col<hakim[0].length;col++)// we are using for loop to initialize the elements of row nbr 2 to 10
        hakim[2][col]=10;

        System.out.println(hakim.length);// 3 rows
        System.out.println(hakim[0].length);// 4 columns


        for(int col=0;col<hakim[0].length;col++)// to print the new values of elements of row nbr 2
            System.out.println(hakim[2][col]);

    }
}
