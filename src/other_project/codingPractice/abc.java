package other_project.codingPractice;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
// quiz : get 3 num from user and print the largest one
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = s.nextInt();
        System.out.print("Enter the second number: ");
        y = s.nextInt();
        System.out.print("Enter the third number: ");
        z = s.nextInt();

        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
    }
}
