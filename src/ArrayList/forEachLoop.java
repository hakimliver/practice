package ArrayList;

import java.util.ArrayList;

public class forEachLoop {


    public static void main(String[] args) {


        // print all elements using FOR EACH LOOP
        // 1 single D array
        int[] number={1,3,6,8,546,0};
        for (int i:number)
            System.out.println(i);

        // 2 arrayList
        ArrayList<String> nameList=new ArrayList<String>();
        nameList.add("hakim");
        nameList.add("klop");
        nameList.add("tizi");
        nameList.add("sadio");

            for (String item:nameList)
                System.out.print(item+" " );
    }
}
