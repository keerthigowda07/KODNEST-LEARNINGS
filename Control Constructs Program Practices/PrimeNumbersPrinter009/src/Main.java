import java.util.Scanner;
public class Main {
	public static void printPrimes(int n)
	{
		for (int i=1; i<=n; i++) 
		{
			int count = 0;
			 for (int j=2; j<=i/2;j++)
			 {
				 if (i%j==0)
				 {
					 count++;
					 break;
				 }
			 }
			 if (count==0)
			 {
				 System.out.println(i);
			 }
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		printPrimes(n);
	}
}
