package other_project.codingPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practice {



    public static void main(String[] args) {

        Scanner hakim = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = hakim.nextInt();


        if (age >= 18) {
            System.out.println("you are able to vote");

        } else {
            System.out.println(" you are not able to vote ");
        }

hakim.close();
    }


}

