package ArrayPractice;

import java.util.Scanner;

public class arrayPractice_3 {

    public static void main(String[] args) {

        // to get the size of array from the user
        Scanner input=new Scanner(System.in);
        System.out.print(" enter the size of the array ");
        int size;
        size=input.nextInt();
        double[] salaries= new double[size];


// fill array
        for(int i=0;i<salaries.length;i++) {
            System.out.println("enter salary for employee nbr " + (i + 1));
            salaries[i] = input.nextDouble();
        }
        double sum=0,avg=0;
        for (int i=0;i<salaries.length;i++) {
            sum +=salaries[i];
        }
        System.out.println(" the sum of salaries is "+ sum);
        System.out.println("the average of salaries is "+sum/salaries.length);

    }
}
