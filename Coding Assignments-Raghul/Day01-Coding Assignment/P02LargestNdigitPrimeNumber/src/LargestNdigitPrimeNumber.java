import java.util.Scanner;

public class LargestNdigitPrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of digits of prime number to find largest prime number with you are entered number of digits:");
		int n=scan.nextInt();
		int startNo=1;
		int endNo=1;
		int largestPrime=0;
		
		//if user entered the number of digits is 1
		if(n==1) {
			for(int i=2; i<10; i++) {
				if(isPrime(i)==true) {
					if(i>=largestPrime) {
						largestPrime=i;
					}
				}
			}
		}
		//if user entered the number of digits greater than 1, we have to find starting number and ending number for looping
		else {
			for(int i=1; i<n; i++) {
				startNo*=10;
				endNo=startNo*10-1;
			}
		}
		
		//finding largest prime number with user entered number of digits
		for(int i=startNo; i<=endNo; i++) {
			if(isPrime(i)==true) {
				if(i>=largestPrime) {
					largestPrime=i;
				}
			}
		}
		
		//printing the largest prime number
		System.out.println(largestPrime);
	}
	
	// finding, is number prime or not?
	public static boolean isPrime(int n) {
		boolean isPrimeNumber=false;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isPrimeNumber=false;
				break;
			}
			else {
				isPrimeNumber=true;
			}
		}
		return isPrimeNumber;
	}

}
