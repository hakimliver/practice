package SDET_PROBLEMS;

public class odd_OR_even {
	
	
	public static void main(String[] args) {
		
		
		// the logic is: if the rest of division is /2 is 0 it means that 
		// this number is even, but if the rest is different then 0 then it is odd
		odd_OR_even.check(20);
	}
	public static void check(int number) {
		
		if(number%2==0)
		{
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
	}

}
