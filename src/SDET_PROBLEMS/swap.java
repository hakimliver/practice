package SDET_PROBLEMS;

public class swap {

	public static void main(String[] args) {
		
		// swapping
		swap.swap_int2();


	}
	static void swap_int(){

		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a+  " b is "+b);
	}
	static void swap_int2(){
		int a=10,b=20;

		int t=a;
		a=b;
		b=t;
		System.out.println("a is "+a+  " b is "+b);
	}

	static void swap_strings(){
		String x="hello";
		String y ="welcome";

		x=x+y; // x=hellowelcome
		y=x.substring(0,(x.length()-y.length()));// 12-7

		x=x.substring(y.length(),x.length());

		System.out.println(x+"  "+y);

	}

}
