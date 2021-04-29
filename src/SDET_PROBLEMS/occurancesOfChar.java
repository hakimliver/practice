package SDET_PROBLEMS;

public class occurancesOfChar {
    public static void main(String[] args) {

        String str="hello word level";
       int len1= str.length();
       String str2=str.replace("l","");
       int len2=str2.length();
        System.out.println("number of occurences of l is :"+(len1-len2));



    }

}

