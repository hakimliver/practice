package javaTpoint;

public class check_armstrong_2 {

    public static void main(String[] args) {

// Let's write a java program to check whether the
// given number is armstrong number or not.
//Armstrong Number in Java: A positive number is
// called armstrong number if it is equal to the sum of
// cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

        int num=153;
        int temp=num;
        int sum=0;
        int r;

        while(num>0){
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }

        if(sum==temp)
            System.out.println("the number is armstrong number");
        else
            System.out.println("it is not armstrong");
    }




}
