import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double tempInCelsius=temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.println(tempInCelsius+" -- the temperature converted to Celsius.");
	}
}
