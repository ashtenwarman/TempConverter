package exercises;

import java.util.Scanner;

/**
 * @author add Kelvin?
 *
 */
public class TempConverter {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Select known temperature type to be converted \n   1)C\n   2)F\n   3)K");
			int decision = s.nextInt();

			if (decision == 1) {
				System.out.println("Convert to\n   1)Fahrenheit\n   2)Kelvin");
				int d = s.nextInt();
				if (d == 1) {
					System.out.println("Enter degrees Celsius to convert to Fahrenheit:");
					double degrees = s.nextDouble();
					double convertTemp = ((degrees * 1.8) + 32);
					System.out.println(degrees + "°C is " + convertTemp + "°F");
				} else if (d == 2) {
					System.out.println("Enter degrees Celsius to convert to Kelvin:");
					double degrees = s.nextDouble();
					double convertTemp = degrees + 273.15;
					System.out.println(degrees + "°C is " + convertTemp + "°K");
				} else {
					System.out.println("Not a valid option");
				}

			} else if (decision == 2) {
				System.out.println("Convert to\n   1)Celsius\n   2)Kelvin");
				int d = s.nextInt();
				if (d == 1) {
					System.out.println("Enter degrees Fahrenheit to convert to Celsius:");
					double temp = s.nextDouble();
					double convertTemp = ((temp - 32) * 0.5556);
					System.out.println(temp + "°F is " + convertTemp + "°C");
				} else if (d == 2) {
					System.out.println("Enter degrees Fahrenheit to convert to Kelvin:");
					double temp = s.nextDouble();
					double convertTemp = (0.5556 * (temp + 459.67));
					System.out.println(temp + "°F is " + convertTemp + "°K");
				} else {
					System.out.println("Not a valid option");
				}
				
			} else if(decision == 3) {
				System.out.println("Convert to\n   1)Celsius\n   2)Fahrenheit");
				int d = s.nextInt();
				if(d == 1) {
					System.out.println("Enter degrees Kelvin to convert to Celsius:");
					double temp = s.nextDouble();
					double convertTemp = temp - 273.15;
					System.out.println(temp + "°K is " + convertTemp + "°C");
				} else if(d == 2) {
					System.out.println("Enter degrees Kelvin to convert to Fahrenheit:");
					double temp = s.nextDouble();
					double convertTemp = ((1.8*(temp-273.15)) + 32);
					System.out.println(temp + "°K is " + convertTemp + "°F");
				} else {
					System.out.println("Not a valid option");
				}
			}
			
			
			else {
				System.out.println("Not a valid option");
			}
			s.close();
		} catch (Exception e) {
			System.out.println("Exception thrown\n" + e);
		}
	}

}
