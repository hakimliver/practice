package other_project.practiceAbstaractClass;

public class main {
    public static void main(String[] args) {


   // RetailItem hh = new RetailItem() ; ===>> this not possible because
        // we can't create an object of an interface

        cdClass bb = new cdClass();// we can create an object of the abstract class


        RetailItem r1=new cdClass();
        r1.GetItemPrice();  // we can create an object like that but it needs to implement the interface
                        // so in this example cdClass implement the interface (RetailItem)
        // so we can create an object inside it

        RetailItem r2 = new cdClass();
        r1.GetItemPrice();// important


    }

}
