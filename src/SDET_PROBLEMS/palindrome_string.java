package SDET_PROBLEMS;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {

		// the logic is reverse the string and then compare
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string ");
		String org_str= scn.next();
		
		String rev="";
		for(int i=(org_str.length()-1);i>=0 ;i--) {
			rev=rev+org_str.charAt(i);
		}
		if(rev.equalsIgnoreCase(org_str)) {
			System.out.println("palindrome string");
		}else{
			System.out.println("not palindrome string");
		}
		
		
	}

}
