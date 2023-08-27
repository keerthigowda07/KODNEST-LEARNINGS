import java.util.Scanner;
public class Main {
	public static void printEvenNumbers(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		printEvenNumbers(n);
	}
}
