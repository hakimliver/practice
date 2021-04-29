package ArrayPractice;

import java.util.Arrays;

public class two_D_Array_5 {
    public static void main(String[] args) {


        // declaration
        //Syntax: dataType[][]arrayName=new dataType[rows][columns];
        // example ==>

        double[][]hakim=new double[3][4];


        // assigning array elements:
        // Syntax: arrayName[row][column]=...;===> dont forget array is zero based
        // example:==>
        hakim[0][0]=100;
        hakim[0][1]=200;
        hakim[0][2]=300;

        hakim[2][3]=1234;



        // length
        // arrayName.length ===> gives the number of rows
        System.out.println(hakim.length);// ==> 3
        // arrayName[anyIndex].length ===> gives the number of columns
        System.out.println(hakim[1].length);//==> 4


        // Initialization
        //Syntax: dataType[][]arrayName={{1,2,3},{4,5,6},{7,8,9}};
        // we will get :   1  2  3
        //                 4  5  6
        //                 7  8  9

        // exp2:
        // get the length of row and length of col
        int[][] hakim2={{10,20,30,35},{40,50,60,65},{70,80,90,95}};// 3 rows and 4 col
        System.out.println(hakim2.length);// 3 rows
        System.out.println(hakim2[2].length);// 4 columns

        // print the elements of an array using toString method
        System.out.println(Arrays.deepToString(hakim2));


        // let's initialize the elements of the row number 2 to 10
        for (int col=0;col<hakim2[2].length;col++)
            hakim2[2][col]=10;
// now let's print it
        for (int col=0;col<hakim2[2].length;col++)
            System.out.println(hakim2[2][col]);


        // let's initialize the elements of col 1 to 5
        for (int row=0;row<hakim2.length;row++)
            hakim2[row][1]=5;
        // now let's print it
        for (int row=0;row<hakim2.length;row++)
            System.out.println(hakim2[row][1]);






    }
}
