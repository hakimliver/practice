package SDET_PROBLEMS;

public class nbr_of_oddANDeven {

	public static void main(String[] args) {
		
		nbr_of_oddANDeven.meth(123468);



	}
	public static void meth(int number) {
		int count_odd=0;
		int count_even=0;

		while(number>0)
		{
			int rem=number&10;
			if((rem&2)==0) {
				count_even++;
			}else {
				count_odd++;
			}
			number=number/10;

		}
		System.out.println("number of even numbers : "+count_even);
		System.out.println("number of odd numbers : "+count_odd);

	}












}
