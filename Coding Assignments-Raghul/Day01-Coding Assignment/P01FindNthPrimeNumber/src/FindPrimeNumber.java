import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N th number");
		int n=scan.nextInt();
		
		int count=0;
		int primeNo = 0;
		int i=2;
		while(count<n) {
			
			if(isPrimeNumber(i)==true) {
				count++;
				primeNo=i;
			}
			i++;
		}
		System.out.println(primeNo);

	}
	
	public static boolean isPrimeNumber(int n) {
		 boolean isPrime = false;
		 if(n==2) {
			 isPrime=true;
		 }
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				isPrime= false;
				break;
			}
			else {
				isPrime= true;
			}
		}
		return isPrime;
	}
}
