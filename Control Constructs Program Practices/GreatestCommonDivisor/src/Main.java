import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		findGCD(a, b);
	}
	public static void findGCD(int a, int b)
	{
		int hcf=0;
		for(int i=1; i<=a||i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
	}
}
