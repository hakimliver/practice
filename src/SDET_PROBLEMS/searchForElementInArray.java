package SDET_PROBLEMS;

public class searchForElementInArray {

    public static void main(String[] args) {


        // search for an element in array
        int a[] = {10, 4, 5, 76};
        int num = 3;
        boolean status = false;
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                System.out.println("the element is present at index  " + i);
                status = true;
            }
        }
        if (status == false) {
            System.out.println("the element is not present");

        }

    }

}
