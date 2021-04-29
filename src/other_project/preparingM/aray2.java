package other_project.preparingM;

import java.util.Scanner;

public class aray2 {

    public static Scanner hh = new Scanner(System.in);

    public static void main(String[] args) {
// declare the array by the user

        System.out.println("enter the size ");
        int size;
        size = hh.nextInt();
        int[] numbers = new int[size];

        System.out.println("the size of this array is  " + numbers.length);

        fill(numbers);
        print(numbers);
        min(numbers);

    }


    // fill the array
    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the elements  " + (i + 1));
            numbers[i] = hh.nextInt();
        }
    }

    // print the values of this array
    public static void print(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }


// find the min
   public static void min(int[] numbers){
       int  minimum=numbers[0];
   for (int i=0;i<numbers.length;i++){
       if(minimum>numbers[i])  {
           minimum = numbers[i];
       }
   }
       System.out.println("the min number is " + minimum);
   }


}