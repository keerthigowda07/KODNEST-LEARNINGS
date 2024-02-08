import java.util.Scanner;

public class CharectarizingDataElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int noOfElements=scan.nextInt();
		
		int []arr=new int[noOfElements];
		String []arr2=new String[arr.length];
		
		System.out.println("Enter data points: |");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Entered data points: |");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" | ");
		}
		System.out.println();
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0) {
				arr2[i]="Even";
			}
			else {
				arr2[i]="Odd";
			}
		}
		System.out.print("Categorization results: |");
		for(int i=0; i<=arr2.length-1; i++) {
			System.out.print(arr2[i]+" | ");
		}
	}

}
