package javaTpoint;

public class factorial_1 {


    public static void main(String[] args) {
        meth1(4);
    }


    //Factorial Program in Java: Factorial of n is the product of all
    // positive descending integers. Factorial of n is denoted by n!.
    // For example:
    //4! = 4*3*2*1 = 24
    //5! = 5*4*3*2*1 = 120

// factorial
    public static void meth1(int num){
        int product=1;
        for(int i=1;i<=num;i++)
        {
            product=product*i;// 6
        }
        System.out.println(product);

    }

}
