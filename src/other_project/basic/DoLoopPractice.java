package other_project.basic;

import java.util.Scanner;

public class DoLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalHour;
		Scanner scan = new Scanner(System.in);
		boolean isNumberOk = false;
		do {
			System.out.println("Enter A NUmber : ");
			totalHour=scan.nextDouble();
			if(totalHour<0) {
				System.out.println("Enter NUmber Between 0 to 40");
			} else {
				isNumberOk = true;
			}
		} while(isNumberOk==false);


	}

}
