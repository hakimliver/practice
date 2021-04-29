package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class exercice_8 {


    // write a program that fills an array with n integers entered by the user
    // suppose that the user can enter at least 1 number and at most 20 numbers


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" how many elements ? ");

        int n = input.nextInt();

        while (n > 20 || n <= 0) {
            System.out.println("invalid number , try again ");
            n = input.nextInt();
        }


        int[] numbers = new int[n];

        fillArray(numbers);
        printArray(numbers);



    }
    public static void fillArray ( int[] numbers ){
        Scanner input=new Scanner(System.in);
        for (int i =0;i< numbers.length;i++)
            numbers[i]=input.nextInt();

    }
    public static void printArray(int[]numbers){
        System.out.println("the elements are ");
        System.out.println(Arrays.toString(numbers));
    }

}
