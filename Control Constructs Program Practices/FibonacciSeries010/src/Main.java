import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);
	}
	public static void printFibonacciSeries(int n)
	{
		int firstNum=0;
		int secondNum=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstNum+" ");
			int nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
		}
	}
}
