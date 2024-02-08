import java.util.Scanner;

public class CalculateAvgDailySales {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of days you want to analyze");
		int days=scan.nextInt();
		
		int sumOfDailySales=0;
		for(int i=1; i<=days; i++) {
			System.out.println("Enter the day-"+i+" sales figure: ");
			int dailySalesFiger=scan.nextInt();
			sumOfDailySales+=dailySalesFiger;
		}
		System.out.println("The average daily sales based on the provided daily sales figures is "+(sumOfDailySales/days));

	}

}
