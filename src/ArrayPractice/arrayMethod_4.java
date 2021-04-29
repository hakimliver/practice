package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMethod_4 {

    static Scanner input = new Scanner(System.in);

    // to pass an array as parameter in method the method must be returning an array
    public static void main(String[] args) {

        System.out.println(" enter the size of the array ");
        int size,searchId;
        size = input.nextInt();
        int[] jsk = new int[size];

        fillArray(jsk);
        printArray(jsk);

        System.out.println("enter the id to search for ");
        searchId=input.nextInt();
       int returntIndex= search(jsk,searchId);
       if (returntIndex>=0)
           System.out.println("the item is found ");
       else
           System.out.println("item is not found ");
    }


    // let's create a method
    public static void fillArray(int[] name) {

        for (int i = 0; i < name.length; i++) {
            System.out.println("enter nbr " + (i + 1));
            name[i] = input.nextInt();
        }
    }


    // another method
    public static void printArray(int[] list) {

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]+" ");

        }

    }

    public static int search(int[]list,int target) {
        for (int i = 0; i < list.length; i++)
            if (list[i] == target)
                return i;
        return -1;
        }



}