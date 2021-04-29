package SDET_PROBLEMS;

public class findMissingNum {

    public static void main(String[] args) {

        // find the missing number in array
        // there shouldn't be any duplicate number

        int a[]={1,2,3,5};


// find the missing number in this array

        int sum1=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum1=sum1+a[i];
        }
        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        int missingNumber;
        missingNumber=sum2-sum1;
        System.out.println(missingNumber);
    }


}
