package SDET_PROBLEMS;

public class find_factorial {


    public static void main(String[] args) {

        // example: the factorial of the number 5= 1*2*3*4*5=120

        int number=5;
        int factorial = 1;

        for (int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);



    }
}
