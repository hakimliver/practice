package SDET_PROBLEMS;

public class num_odd_and_even_in_number {





    public static void main(String[] args) {
        int number=123456;
        int num_odd=0;
        int num_even=0;
        int reminder;
        while (number>0)
        {
            reminder=number%10;
            if (reminder%2==0)
                num_even++;
            else
                num_odd++;
            number=number/10;
        }
        System.out.println("number of odd "+num_odd);
        System.out.println("number of even "+num_even);







    }
}
