import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking user input
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		//finding the sum of all divisors of entered number
		int numCopy=num;
		int devisor = 0;
		for(int i=1; i<numCopy; i++) {
			if(numCopy%i==0) {
				devisor+=i;
			}
		}
		
		//printing, is the entered number Perfect number or not?
		if(devisor==num) {
			System.out.println(num+" is a Perfect Number");
		}
		else {
			System.out.println(num+" is not a Perfect Number");
		}
	}

}
