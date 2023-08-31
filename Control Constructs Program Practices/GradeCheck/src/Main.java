import java.util.Scanner;

public class Main {
	public static void checkGrade(int grade)
	{
		if(grade>50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int grade=input.nextInt();
		checkGrade(grade);
	}
}
