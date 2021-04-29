package SDET_PROBLEMS;

public class generate_fibonacci {


    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 .....
        int n1=0,   n2=1   ,sum=0;

        for(int i=2;i<10;i++)
        {
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        System.out.println(sum);


    }



    
}
