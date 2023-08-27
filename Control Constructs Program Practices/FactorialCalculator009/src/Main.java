import java.util.Scanner;
public class Main {
	public static void calculateFactorial(int n)
	{
		int i=1;
		long factorial=1;
		while(i<=n)
		{
			factorial=factorial*i;
			i++;
		}
		System.out.println(factorial);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		calculateFactorial(n);
	}
}
