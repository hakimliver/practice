package problem_solution;

import java.util.ArrayList;

public class commonElement {


    public static void main(String[] args) {
        commonElement.intersect();
    }

    public static void intersect() {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    array.add(nums1[i]);
                    break;
                }
            }
        }
        System.out.println(array);
    }
}


