package other_project.basic;

import java.io.InputStream;
import java.util.Scanner;


public class forMe {

	public static void main(String[] args){
		
	 String empName	;
	 double totHour;
	 double hRate;
	 double grossPay;
	 double netPay = 0;
	 
	 
	 
	
	
	
	
	System.out.println("please follow the instructions");
	
	
	Scanner input= new Scanner(System.in);
	
	
	
	System.out.println(" enter your name ");
	empName= input.nextLine();
	
	System.out.println("enter total hours");
	totHour=input.nextDouble();
	
	
	System.out.println("enter hourly rate");
	hRate=input.nextDouble();
	

	
	grossPay=totHour*hRate;
	
	if (grossPay< 1500){
		netPay=grossPay*(1- .1);
	}
	else if (grossPay>=1500 && grossPay<3000) {
		netPay=grossPay*(1- .2);
	}
	else if (grossPay>=3000 && grossPay<5000) {
		netPay=grossPay*(1- .3);
	}
	else if (grossPay>=4500 && grossPay<6000) {
		netPay=grossPay*(1- .35);
	}
	else if (grossPay>=6000) {
		netPay=grossPay*(1- .4);
	}
	
	
	
	
	
	System.out.println("%%%% pay check %%%%%%%");
	System.out.println("hi " + empName);
	System.out.println("you worked "+ totHour + " hours" );
	System.out.println("and you get paid "+ hRate +" per hour");
	System.out.println("your gross pay will be:" + grossPay );
	System.out.println("your pay after tax will be " + netPay);
	System.out.println("thank you !");
	
	
	
	
	
	
	
	
	}
}
