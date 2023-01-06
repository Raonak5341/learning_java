package basicjava;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double cels, faren;
		
		System.out.print("Fahrenheit: ");
		faren = input.nextDouble();
		
		cels = (faren-32)*0.56;
		
		System.out.print("Celsius = "+cels);
	}

}
