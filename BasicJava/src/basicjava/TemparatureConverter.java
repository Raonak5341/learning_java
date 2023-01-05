package basicjava;

import java.util.Scanner;

public class TemparatureConverter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double cels, faren;
		
		System.out.print("Celsius: ");
		cels = input.nextDouble();
		
		faren = 1.8 * cels + 32;
		
		System.out.print("Temparature in fahrenheit is: "+faren);
	}

}
