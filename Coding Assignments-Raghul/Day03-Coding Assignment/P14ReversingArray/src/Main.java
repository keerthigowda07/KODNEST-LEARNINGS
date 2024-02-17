import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of integers");
		int n=scan.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("Enter "+n+" number of integer type of measurement values");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
