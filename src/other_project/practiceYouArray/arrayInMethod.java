package other_project.practiceYouArray;

import java.util.Random;
import java.util.Scanner;


public class arrayInMethod {




      static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the size of array");
        int size;
        size= input.nextInt();
        int[]ids=new int[size];

        fillArray(ids);// to fill
        printArray(ids);// to print
    }


  public static  void fillArray(int[]list)
  {
      for (int i=0;i< list.length;i++){
          System.out.println("enter number "+(i+1));
          list[i]=input.nextInt();
      }

  }



   // this method is to print array
    public static  void printArray(int[]list)
    {
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]);

        }






            }






    }

