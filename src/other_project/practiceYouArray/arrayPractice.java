package other_project.practiceYouArray;

import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size;
        size =input.nextInt();
        int[] numbers=new int[size];


        for(int i=0; i<numbers.length; i++){
            System.out.println("enter the number "+(i+1));// i+1 because we want to get the first output

            numbers[i]=input.nextInt();
        }





        int sum=0,count=0;

        for(int i=0;i<numbers.length;i++)
        {
           if (numbers[i]>0){
               sum+= numbers[i];
               count++;
           }
        }
        System.out.println("the sum of salaries is "+ sum);
        System.out.println("the average of positive number is "+ sum/count);
    }
}
