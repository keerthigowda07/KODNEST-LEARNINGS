import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Travelling Speed and Time of Journey");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		System.out.println(calculateDistance(speed,time));

	}
	public static double calculateDistance(double speed, double time) {
		return speed*time;
	}
}
