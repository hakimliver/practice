package other_project.basic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScalculatorV2 {

	public static void main(String[] args) {
		   // variables
				String empName;
				double totalhour;
				double hrate;
				double grossPay;
				double netPay = 0 ;
				
				//application starter test
				System.out.println("####Employee salary calculator V1.o###");
				
				System.out.println("please follow the instruction....");
				
				
				//input
				Scanner scanMachine = new Scanner(System.in);
				
				System.out.println("enter employee name:");
				empName = scanMachine.nextLine();
				System.out.println("enter total hours :");
				totalhour = scanMachine.nextDouble();
				
				System.out.println("enter hourly rate : ");
				hrate = scanMachine.nextDouble();
				
				// process
				grossPay = totalhour * hrate;
				
				
				// gross pay tax rate
				//less than 1,500$                    10$
				//between 1,500 and 2,999$            20$
				//between 3000$ and 4,499             30%
				//between 4,500 and 5,999$            35%
				//over 6000$                          40%
				
				
				if(grossPay <1500 ) {
					netPay = grossPay * (1-.10);
				}else if (grossPay>=1500 && grossPay<3000) {
				    netPay = grossPay * (1-.20);
				}else if (grossPay >=3000 && grossPay<4999) {
					netPay=grossPay * (1- .30);
				}else if (grossPay >= 4500 && grossPay < 5999) {
					netPay=grossPay * (1- .35);
				}else if (grossPay >= 6000) {
					netPay= grossPay * (1- .40);
				}
			                                
				//output
				System.out.println("----------pay check-----");
				System.out.println(" Employee name is :"+empName);
				System.out.println("total hours is:" + totalhour);
				System.out.println("hourly rate is :"+ hrate);
				System.out.println("Gross pay is :"+ grossPay);
				System.out.println("net pay is " + netPay);
				System.out.println("------ ----- -------");
				//application exit text
				System.out.println("### thanks for using bye bye ###");


	}

}
