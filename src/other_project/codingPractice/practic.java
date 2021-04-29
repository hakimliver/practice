package other_project.codingPractice;

import java.util.Scanner;

public class practic {
    public static void main(String[] args) {

        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = s.nextInt();
        System.out.print("Enter the second number: ");
        y = s.nextInt();
        System.out.print("Enter the third number: ");
        z = s.nextInt();

        if (x<y&&y<z){
            System.out.println("incressing ");
        }
        else if (x>y&&y>z){
            System.out.println(" decressing");
        }
        else {
            System.out.println(" nothing ");
        }
    }
}
