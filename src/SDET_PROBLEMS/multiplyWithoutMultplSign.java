package SDET_PROBLEMS;

public class multiplyWithoutMultplSign {


    public static void main(String[] args) {
        multiplyWithoutMultplSign.multiply(3,5);


    }

    public static void multiply(int a,int b){

        int product=0;
        for (int i=1;i<=b;i++)
        {
            product=product+a;
        }
        System.out.println(product);

    }
}
