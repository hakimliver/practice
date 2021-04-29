package ArrayPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInitialization_2 {
    public static void main(String[] args) {
        // initialization with declaration
        //exp : double[]sales={12,15.3,50.33};


        // 1st way to initialize
        double[]sales={12,15.3,50.33,2};
// print elements using for each loop
        for (double a:sales)
            System.out.print(a+" ");


        // don't forgot that array is a zero based
        // ==> let's see this example
        System.out.println(sales[3]);



        // 2nd way to initialize
        // exp: let's declare this array
        int[] number=new int[5];// declaring an array
        // let's assign values
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;



        // accessing elements
        // syntax: arrayName[element index]
        // example:

        System.out.println(number[2]);





    }
}
