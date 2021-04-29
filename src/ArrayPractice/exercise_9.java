package ArrayPractice;

public class exercise_9 {


    // write a program that displays the sum ,product,and the
    // average of the elements of an integer

    // exp: [1,2,-3,5,7]
    // sum=12, product=-210 , avg=2.4


    public static void main(String[] args) {
        int[] numbers={1,2,-3,5,7};

        int sum=0;
        int product=1;
        double avg;

        for (int i=0;i< numbers.length;i++){
            sum+=numbers[i];
            product*=numbers[i];
        }
        avg=(double)sum/numbers.length;

        System.out.println("the sum "+sum+"the product "+product+"the average "+avg);


    }

}
