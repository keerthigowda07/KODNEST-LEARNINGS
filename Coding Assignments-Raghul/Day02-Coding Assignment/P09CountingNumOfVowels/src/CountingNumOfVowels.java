import java.util.Scanner;

public class CountingNumOfVowels {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scan.nextLine();
		
		char []arr =input.toCharArray();
		
		int vowelCount=0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]=='A'||arr[i]=='E'|| arr[i]=='I'|| arr[i]=='O'|| arr[i]=='U'|| arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u')
			{
				vowelCount++;
			}
		}
		System.out.println("Number of vowels available in the input string: "+vowelCount);
	}
}
