package SDET_PROBLEMS;

public class findTheMaxNumberInArray {

    public static void main(String[] args) {



        int a[]={10,3,5,1,123};


// find the max of an array
//        int max=a[0];
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]>max)
//            {
//                max=a[i];
//            }
//        }
//        System.out.println("the max number is : "+max);



        // find the min  number present in array
        int min=a[0];


        for(int i=0;i<a.length;i++){
            if(a[i]<min)
            {
                min=a[i];
            }
        }

        System.out.println("the min number is: "+min);


    }


}
