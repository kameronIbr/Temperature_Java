/// Lab 01: Temperature
/// Kameron Ibraheem
/// 
/// None

import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){
		Scanner scrn = new Scanner(System.in);

		System.out.print("Enter Fahrenheit: ");
		double f = scrn.nextInt();
		
		double c = (f-32) * 5/9;
		
		System.out.print(f + " degrees Fahrenheit = " + c + "Celsius");
	}
}


