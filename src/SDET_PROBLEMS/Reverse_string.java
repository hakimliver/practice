package SDET_PROBLEMS;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {


		
		Reverse_string.reverse("izem");
		
		
		
		
	}
	
	// first way (concatenation)
	public static void reverse(String str) {

		String rev = "";
		for(int i=(str.length()-1);i>=0 ;i--) {
			rev=rev+str.charAt(i);

		}
		
		System.out.println(rev);
	}
	
	// 2nd way (StringBuffer)
//	StringBuffer sb=new StringBuffer(String.valueOf(num));	
//	StringBuffer rev=sb.reverse();
//	System.out.println(rev);

}
