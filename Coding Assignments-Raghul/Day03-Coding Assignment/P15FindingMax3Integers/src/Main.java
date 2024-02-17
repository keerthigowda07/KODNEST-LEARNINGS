import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3D array length");
		int n=scan.nextInt();
		
		int [][]arr=new int[n][n];
		
		System.out.println("Enter array elements");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			int max=arr[i][0];
			for(int j=0; j<=arr[i].length-2; j++) {
				if(arr[i][j+1]>arr[i][j]) {
					max=arr[i][j+1];
				}
			}
			System.out.println(max);
		}
	}

}
