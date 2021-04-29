package ArrayList;





import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class abc_2 {

    public static void main(String[] args) {
        // declaring ArrayList
        ArrayList<String> nameList=new ArrayList<String>();

        // add items to ArrayList by default
        nameList.add("hakim");
        nameList.add("klop");
        nameList.add("tizi");
        nameList.add("sadio");
        System.out.println(nameList);

        // add to a spesific location
        nameList.add(1,"omar");
        System.out.println(nameList);

        // access an item
        // use the get()method
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(3));

        // change an element
        System.out.println(nameList.set(2,"firminho"));
        System.out.println(nameList);

        // remove an item
        // 1st way:by index
        //2nd way :by value
        nameList.remove(1);
        System.out.println(nameList);// by index
        nameList.remove("hakim");
        System.out.println(nameList);

        // Loop through ArrayList
        // print all elements
        for (int i=0;i<nameList.size();i++)
            System.out.println(nameList.get(i) );

        // SORT AN ARRAYLIST
        // use the method of the collections class for sorting lists
        // alphabetically or numerically
        Collections.sort(nameList);
        System.out.println(nameList);

      // for each loop in arrayList ===> imp
        for (String item:nameList)
            System.out.println(item);






    }
}
