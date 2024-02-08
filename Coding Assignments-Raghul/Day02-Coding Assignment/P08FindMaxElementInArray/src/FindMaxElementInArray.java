import java.util.Scanner;

public class FindMaxElementInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int noOfElements=scan.nextInt();
		
		int []arr=new int[noOfElements];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.print("Entered array elements: |");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" | ");
		}
		System.out.println();
		
		int maxElement=arr[0];
		for(int i=1; i<=arr.length-1; i++) {
			if(arr[i]>arr[i-1]) {
				maxElement=arr[i];
			}
		}
		
		System.out.println("Maximum element is: "+maxElement);
	}

}
