package other_project.codingPractice;

import java.util.Scanner;

public class probSolving {

    public static void main(String[] args) {

        findLargestNumber();


    }
    public static void findLargestNumber(){
int a,b,c;
        Scanner hh= new Scanner(System.in);
        System.out.println("enter numbers");
        a=hh.nextInt();
        b=hh.nextInt();
        c=hh.nextInt();

        if (a>b && a>c);{
            System.out.println(" a is the largest");
        }
         if (b>a && b>c){
            System.out.println(" b is the largest");

        }
         else if (c>a&&c>b){
             System.out.println("c is largest");

         }





    }



}
