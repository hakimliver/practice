package SDET_PROBLEMS;

import java.util.HashSet;

public class findDuplicateElementInArraY {


    public static void main(String[] args) {

        int a2[]={2,3,4,2};
        String a[]={"hakim","kenza","kenza","hakim"};
        // duplicate
//boolean flag=false;
     for(int i=0;i<a.length;i++){
         for (int j=i+1;j<a.length;j++){
             if (a[i]==a[j]){
                 System.out.println(a[i]);
                // flag=true;
             }
         }
     }
//     if (flag==false){
//         System.out.println("no duplicate element");
//     }
// duplicate number
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a2[i]==a2[j]){
                    System.out.println(a2[i]);
                    // flag=true;
                }
            }
        }


    }

}
