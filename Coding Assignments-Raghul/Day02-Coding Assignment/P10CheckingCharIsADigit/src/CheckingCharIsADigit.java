import java.util.Scanner;

public class CheckingCharIsADigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		
		char []arr=new char[scan.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=scan.next().charAt(0);
		}
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		boolean arr2[]=new boolean[arr.length];
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]>='0' && arr[i]<='9') {
				arr2[i]=true;
			}
			else {
				arr2[i]=false;
			}
		}
		
		for(int i=0; i<=arr2.length-1; i++) {
			System.out.println(arr2[i]);
		}
	}

}
