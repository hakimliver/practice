package other_project.basic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScalculatorV1 {

	public static void main(String[] args) {
		   // variables
				String empName;
				double totalhour;
				double hrate;
				double grossPay;
				
				
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
				
				
				//output
				System.out.println("----------pay check-----");
				System.out.println(" Employee name is :"+empName);
				System.out.println("total hours is:" + totalhour);
				System.out.println("hourly rate is :"+ hrate);
				System.out.println("Gross pay is :"+ grossPay);
				System.out.println("------ ----- -------");
				//application exit text
				System.out.println("### thanks for using bye bye ###");


	}

}
