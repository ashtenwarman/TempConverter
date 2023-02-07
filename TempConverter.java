package exercises;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
	
	try {	
		Scanner s = new Scanner(System.in);
		System.out.println("Select known temperature type to be converted \n   1)C  \n   2)F");
		double decision = s.nextDouble();
		
		if(decision == 1) {
			System.out.println("Enter degrees Celsius to convert to Fahrenheit:");
			double temp = s.nextDouble();
			double convertTemp = ((temp * 1.8) + 32);
			System.out.println(temp + "°C is " + convertTemp + "°F");
			
		} 
		else if(decision == 2) {
			System.out.println("Enter degrees Fahrenheit to convert to Celsius:");
			double temp = s.nextDouble();
			double convertTemp = ((temp - 32) * 0.5556);
			System.out.println(temp + "°F is " + convertTemp + "°C");
		}
		else {
			System.out.println("Not a valid input");
		}
		s.close();
	}
	catch(Exception e) {
		System.out.println("Exception thrown\n" + e);
	}
	}

}
