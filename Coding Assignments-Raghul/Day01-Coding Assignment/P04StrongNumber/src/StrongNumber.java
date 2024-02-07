import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking user input
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		//finding the sum of factorial of all digits
		int numCopy=num;
		int ldFactorial;
		int sumOfDigitsFactorial = 0;
		while(num!=0) {
			int ld=num%10;
			ldFactorial=1;
			for(int i=1; i<=ld; i++) {
				ldFactorial*=i;
			}
			sumOfDigitsFactorial+=ldFactorial;
			num/=10;
		}
		
		//printing, is the entered number Strong number or not?
		if(sumOfDigitsFactorial==numCopy) {
			System.out.println(numCopy+" is a Strong Number");
		}
		else {
			System.out.println(numCopy+" is not a Strong Number");
		}
	}

}
