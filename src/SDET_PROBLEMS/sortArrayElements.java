package SDET_PROBLEMS;

import java.util.Arrays;

public class sortArrayElements {


    public static void main(String[] args) {


        int a[]={3,5,4,1,2};
        // we want to get this  elements in sorted way
        //======> this method is called bubble sort

        for (int i=0;i<a.length-1;i++)// number of passes
        {
            for (int j=0;j<a.length-1;j++)// to iterate
            {
                if (a[j]>a[j+1])
                {
                    int tem_num=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem_num;
                }
            }

        }
        System.out.println(Arrays.toString(a));

        //=======> there is an other approach: Array.parallelSort(a);
        //=======> an other approach:Array.Sort(a);
        // if you want to print them in descending order:
        //===> Array.sort(a,collections.reverseOrder());

    }
}
