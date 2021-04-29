package SDET_PROBLEMS;

public class largest_of_3 {

	public static void main(String[] args) {
		
		largest_of_3.method(16, 73, 74);
	}
	
	public static void method(int a,int b,int c) {
		
		if(a>b & a>c)
			System.out.println( a +" is the largest ");
		else if(b>a && b>c)
			System.out.println(b +" is the largest ");
		else
			System.out.println(c +" is the largest");
			
			
	}

}
