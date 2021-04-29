package other_project.preparingM;

import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {

//        // declaring 2 d array
//        String[][] names=new String[2][3];
//
//        System.out.println(names.length);
//        System.out.println(names[0].length);
//
//        names[0][0]="hakim ";
//        names[0][1]="kenza ";
//        names[0][2]="izem ";
//        names[1][0]="lion ";
//        names[1][1]="jsk ";
//        names[1][2]="liverpool ";
//
//       // System.out.print(Arrays.deepToString(names));
//     //  this is the output [[hakim , kenza , izem ], [lion , jsk , liverpool ]]
//
//
//        // let's initialize the elements of row 1 by " virgil "
//        for (int i=0;i<names[0].length;i++)
//            names[0][i]="messi ";
//
//        // now let's print the array
//       System.out.print(Arrays.deepToString(names));
//
//
//        // now let's initialize the elements of col number 2
//        for (int row=0;row<names.length;row++)
//            names[row][1]="sadio";
//        System.out.println(Arrays.deepToString(names));
   int [][] numbers=new int[4][6];
   fill(numbers);
    }

        // fill 2D array
    public static void fill(int[][] numbers) {
        Scanner hh = new Scanner(System.in);
        for (int row = 0; row <numbers.length;row++)
            for (int col=0;col<numbers[0].length;col++){
                System.out.println("enter the data for element with row number "+(row+1)+" and column number "+(col+1));
                numbers[row][col]= hh.nextInt();
            }
        System.out.println(Arrays.deepToString(numbers));



    }




}
