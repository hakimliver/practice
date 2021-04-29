package ArrayPractice;

public class two_D_Array_suite {
    public static void main(String[] args) {
printArray(getArray());
    }
    // returning 2D array
    public static int [][]getArray(){
        int[][]numbers={{1,2,3},{4,5,6},{7,8,9}};
        return numbers;
    }
    public static void printArray(int[][]integers){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++)
                System.out.println(integers[i][j]);
        }


    }

}
