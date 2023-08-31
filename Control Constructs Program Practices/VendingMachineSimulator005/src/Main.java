
import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "P01":
			System.out.println("Pepsi");
			break;
		case "P02":
			System.out.println("Cocacola");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("JalJeera");
			break;
		case "P05":
			System.out.println("Mountai");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println();
		String productCode=input.next();
		getProduct(productCode);
	}
}