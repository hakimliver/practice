package SDET_PROBLEMS;

import java.util.Scanner;

public class reverse_num_2 {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number ");
	int num= scn.nextInt();
	
	
	// 1st way
//	int rev=0;
//	
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num=num/10;}
//	System.out.println(rev);
	
	
	// 2nd way =====> you can also reverse a string with that method
//	StringBuffer sb=new StringBuffer(String.valueOf(num));
//	StringBuffer rev=sb.reverse();
//	System.out.println(rev);
	
	
	
	// 3ed way
	StringBuilder sb=new StringBuilder();
	StringBuilder rev=sb.append(num);
	System.out.println(rev);
	
	
	
	
	}
	
	

}
