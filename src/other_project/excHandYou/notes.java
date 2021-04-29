package other_project.excHandYou;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class notes {
    // 2 types of errors:
    // compile time error: when you write the code you might see errors
    // run time error: when you run the code , if you see something unexpected that called exception
    // unhandled exception will crash the program

    public static void main(String[] args) {
        try {
            Scanner hh = new Scanner(System.in);
            System.out.println("enter x ");
            int x = hh.nextInt();
            System.out.println("enter y");
            int y = hh.nextInt();

            System.out.println(x / y);
        }
        catch (ArithmeticException e){
            System.out.println(" no division by zero ");
        }
        catch (InputMismatchException e){
            System.out.println("error, please enter numeric");
        }




        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
