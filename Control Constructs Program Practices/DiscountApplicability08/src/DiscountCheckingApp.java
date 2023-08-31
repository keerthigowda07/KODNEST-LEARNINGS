import java.util.Scanner;

public class DiscountCheckingApp {

	public static void checkDiscoun(double purchaseAmount) 
	{
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}
		else
		{
			System.out.println("Discount Not Applicable");
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter purchase Amount");
		double purchaseAmount=input.nextDouble();
		checkDiscoun(purchaseAmount);
	}
}
