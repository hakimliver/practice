package SDET_PROBLEMS;

public class printAllEvenAndOddNumInArray {


    public static void main(String[] args) {


        int a[]={1,3,2,5,7};

        System.out.println(" the even numbers are  :");
        for(int i=0;i<= a.length-1;i++)
        {
            if (a[i]%2==0){
                System.out.println(a[i]+" ");
            }
        }
        System.out.println(" the odd numbers are  :");
        for(int value:a)
        {
            if (a[value]%2!=0){
                System.out.println(a[value]+" ");
            }
        }



//    or
//        for(int i=0;i<a.length;i++)
//        {
//            if (a[i]%2==0)
//                System.out.println(a[i]+" is even number");
//            else
//                System.out.println(a[i]+" is odd number");
//        }
//

    }
}
