import java.util.Scanner;

public class Main {
	public static void printTable(int num)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		printTable(num);
	}
}
