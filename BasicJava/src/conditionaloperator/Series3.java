package conditionaloperator;

import java.util.Scanner;

public class Series3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n, sum=0;
		
		System.out.print("Enter Last Number: ");
		n = input.nextDouble();
		
		for(double i=1.5; i<=n; i++) {
			System.out.print(" "+i);
			sum = sum+i;
		}
		System.out.println();
		System.out.println("Sum is: "+sum);
		
	}

}
