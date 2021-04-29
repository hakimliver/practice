package ArrayPractice;

public class exercise_11 {


    public static void main(String[] args) {
        // write a program tha displays the maximum and minimum elements of an array

        int[]numbers={2,4,6,-3,5 };
        int min= numbers[0];
        int max=numbers[0];

        for(int i=1;i<numbers.length;i++) {
            max = (numbers[i] > max) ? numbers[i] : max;
            min = (numbers[i] < min) ? numbers[i] : min;
        }
        System.out.println("the max "+max+ "the min "+min);
    }
}
