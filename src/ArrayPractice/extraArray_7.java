package ArrayPractice;

import java.util.Arrays;

public class extraArray_7 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,4,98,35,876,974,3222));
        }

//  creating a method and pass a variable length argument lists
    // this means that you can pass as many as you want of values
// to the method when you call it
    // in this example java will create an array
// that is called numbers and the arguments will be the elements
     // of this array
    public static int sum(int...numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++)
            sum+=numbers[i];
        return sum;
    }
}
