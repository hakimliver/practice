package SDET_PROBLEMS;

import java.util.Scanner;

public class number_of_degits {

	public static void main(String[] args) {

		Scanner ss=new Scanner(System.in);
		System.out.println("enter a number ");
		int number=ss.nextInt();
		int count=0;
		while(number>0) {
			number=number/10;
			count++;
		}
		System.out.println(count);
		
		
	}

	// V.IMP: by this logic you can also count how many char in a string
	// by reversing it and injecting int count then increment it
	
}
