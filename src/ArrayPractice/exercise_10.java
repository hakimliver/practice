package ArrayPractice;

public class exercise_10 {
    public static void main(String[] args) {


        // write a prog that displays the numbers of occurrences of an element
        // in array
        // exp [1,1,1,2,3,4]
        // 3 occurs 1 time, 2 occurs 1 time, 4 occurs 1 time , 1 occurs 3 times
        int[]numbers ={1,1,1,2,3,4};
        int searchElement=1;
        System.out.println(getNumberOcc(numbers,searchElement));


    }
    public static int getNumberOcc(int[]numbers,int searchElement){
        int occ=0;
        for (int i=0;i<numbers.length;i++)
            if (searchElement==numbers[i])
                occ++;
            return occ;
    }
}
