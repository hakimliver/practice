package SDET_PROBLEMS;

public class check_prime {

    public static void main(String[] args) {
        int number=10;
        int count = 0;

        if(number>1)
        {
            for (int i=1;i<=number;i++)
            {
                if(number%i==0)
                    count++;
            }
            if (count==2)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }else
            System.out.println("not prime");

    }



}
