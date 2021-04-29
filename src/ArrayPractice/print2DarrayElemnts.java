package ArrayPractice;

public class print2DarrayElemnts {
    public static void main(String[] args) {
        int [][]numbers=new int[2][3];

        numbers[0][0]=1;
        numbers[0][1]=2;
        numbers[0][2]=4;
        numbers[1][0]=3;
        numbers[1][1]=4;
        numbers[1][2]=6;

        System.out.println(numbers.length);
        System.out.println(numbers[0].length);
        System.out.println("hi "+numbers[0][1]);

        for (int row=0;row<numbers.length;row++)
            for (int col=0;col<numbers[row].length;col++)
                System.out.print(numbers[row][col]+" ");
                System.out.println();
////
//            for(int[] hakim:numbers)
//                System.out.println(hakim+" ");



    }
}
