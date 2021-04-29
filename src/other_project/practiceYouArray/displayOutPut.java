package other_project.practiceYouArray;

import java.util.Scanner;

public class displayOutPut {

    public static void main(String[] args) {


        // declaration of the size array by the user
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size;
        size =input.nextInt();
        double[] salaries=new double[size];


        for(int i=0; i<salaries.length; i++){
            System.out.println("enter salary for employee number "+(i+1));// i+1 because we want to get the first output
            // (enter the salary for employee number 1 (not zero)
            salaries[i]=input.nextDouble();
        }




// we want to print the sum of salaries and the average
        double sum=0,avg=0;

        for(int i=0;i<salaries.length;i++)
        {
          sum+= salaries[i];// this expression means : sum=sum+salaries[i]
        }
        System.out.println("the sum of salaries is "+ sum);
        System.out.println("the average of salaries is "+ sum/salaries.length);



//
//        double[] student={13,17,20,30.5};//initialization with declaration
//
//
//
//        // accessing array elements
//        /* exp: */
//         int [] list=new list[10];
//         list[5]=34;



    }
}
