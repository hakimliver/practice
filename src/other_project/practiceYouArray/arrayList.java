package other_project.practiceYouArray;



    import java.util.ArrayList;

public class arrayList {

    // # the arrayList is similar to array,an arrayList allows objects storage
    // # unlike an array, an arrayList object:
              // - automatically expands when a new item is added
              // - automatically shrinks when items are removed
    // Requires: import java.util.ArrayList;

    // creating an arrayList:
    // ArrayList<String>nameList=new ArrayList<String>();

    // to add an item to the ArrayList:
    //  ==> nameList.add("james");
    //  ==> nameList.add("hakim");

    // to get the current size ,call the size method
    // ==> nameList.size(): ==> returns 2 (nbr of items)

    // to access items in an ArrayList,use the get method
    // ==> nameList.get(1);==> 1 is the index of item

    // print all items that is in arrayList:
    // ===> sout(nameList); ==> [james,hakim]

    // remove an item that is in ArrayList:
    // ===> nameList.remove(1); ==> 1 is the index of the item

    // add an item to a location of choice we use add method with two arguments
    // ==> nameList.add(3,"john"); ==> 3 is the index or the location of the item added

    // to replace an existing item,use the "set method"
    // ==> nameList.set(3,"adel"); ==> this statement replaces (john) with (adel)

    // an ArrayList has a capacity , witch is the number of items it can increasing its size
    // the default capacity of an ArrayList is 10 items
    // example: ArrayList<String>nameList=new ArrayList<String>(); ==> this is a default ArrayList

    // to designate a different capacity, use parametrize constructor :
    // ==> ArrayList<String>nameList=new ArrayList<String>(100); ==>

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // default
        list.add("ahmad");
        list.add("hakim");
        list.add("steven");

        System.out.println(list.size());// how many items
        System.out.println(list); // print the list
        System.out.println(list.get(2)); // print the item 2

        list.add(2,"omar");// replace element nbr 2 with omar
        System.out.println(list);

        list.set(3,"turky"); // change the element nbr 3 with tur
        System.out.println(list);

        list.remove(2);// removing element with index 2 (omar)
        System.out.println(list.size());
        System.out.println(list);

    }

}
