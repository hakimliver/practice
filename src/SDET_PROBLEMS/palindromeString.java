package SDET_PROBLEMS;

public class palindromeString {
    public static void main(String[] args) {
        palindromeString.palindromeString();
    }


    public static void palindromeString(){
        String sentence = "A man, a plan, a canal: Panama";

        String[] split1 = sentence.split(",");
//        for (String s:split1) {
//            System.out.println(s);
//        }
        String[] aMan = split1[0].split(" ");
        String[] aplan = split1[1].trim().split(" ");


        String[] split2 = split1[2].split(":");
        String[] acanal = split2[0].trim().split(" ");
        String panama = split2[1].trim();


        String mySentence = "";
        mySentence = mySentence + aMan[0]+aMan[1]+aplan[0]+aplan[1]+acanal[0]+acanal[1]+panama;
        System.out.println(mySentence);

        String rev ="";
        for(int i=mySentence.length()-1; i>=0; i--){
            rev = rev + mySentence.charAt(i);
        }
        System.out.println(rev);


        if(mySentence.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");
    }

}
