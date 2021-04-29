package hakim;

import org.junit.Test;

public class interview {

// nothing
    @Test
    public void prime(){
        int num=17;
        int count=0;
        for (int i=1;i<=17;i++)
        {
            if (num%i==0)
                count++;
        }
        System.out.println(count);
        if (count>2)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }

    @Test
    public void sumOfDegits(){
        int num=1234557;
        int sum=0;

        while (num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);


    }

    @Test
public void nbrEvenAndOdd(){

    int num=1234567;
    int odd=0;
    int even=0;

    while (num!=0)
    {
        int rem=num%10;
        num=num/10;
        if (rem%2==0)
            even++;
        else
            odd++;
    }
        System.out.println("even "+even+" odd= "+odd);

}


    @Test
    public void numOfDegits(){

        int num=123456;
        int count=0;
        while (num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
    @Test
    public void palindromeString(){
        String str="mom",rev="";

        String org=str;

        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
       if (org.equalsIgnoreCase(rev))
           System.out.println("p");
       else
           System.out.println("not palindrome");



    }

    @Test
    public void palindromeNum(){
        int num=121;
        int rev=0;
        int org=num;

        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println(rev);
        System.out.println(num);
        System.out.println(org);
        if (org==rev)

            System.out.println("palindrome");
        else
            System.out.println("not palindrome");


    }

    @Test
    public void revString(){

        String str="hakim";

        String rev="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);


    }

    @Test
    public void reverseInt(){
        int num=1234;

        int rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }

    @Test
    public void swap(){
        int a=10,b=20;
        System.out.println(a+"   "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println(a+"    "+b);
    }


}
