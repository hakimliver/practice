package SDET_PROBLEMS;

public class sum_of_array_elements {


    public static void main(String[] args) {



// first way

//        int a[] = {2,3,5,0,1};
//        int sum=0;
//
//        for (int i=0;i<=a.length-1;i++)
//        {
//            sum=sum+a[i];
//        }
//        System.out.println(sum);


// second way: for each loop
        int a[] = {2,3,5,0,1};
        int sum=0;
        for (int value:a)
        {
            sum=sum+value;
        }
        System.out.println(sum);

    }

}
