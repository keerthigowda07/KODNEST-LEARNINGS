import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number of integers");
		int n=scan.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("Enter "+n+ " number of elements:");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int output:arr) {
			if(output<0) {
				System.out.println("Negative");
			}
			else if(output>0) {
				System.out.println("Positive");
			}
			else {
				System.out.println("Zero");
			}
		}
	}
}
