import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of integers");
		int n=scan.nextInt();
		
		double []arr=new double[n];
		
		System.out.println("Enter "+n+" double type of numbers");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=scan.nextDouble();
		}
		
		double minimum=arr[0];
		for(int i=0; i<=arr.length-2; i++) {
			if(arr[i+1]< arr[i]) {
				minimum=arr[i+1];
			}
		}
		System.out.println(minimum);
	}

}
