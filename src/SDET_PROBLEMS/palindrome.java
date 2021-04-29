package SDET_PROBLEMS;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {


		int rev=0,temp;
		int num=454;//It is the number variable to be checked for palindrome

		temp=num;
		while(num>0){
			rev=(rev*10)+num%10;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
