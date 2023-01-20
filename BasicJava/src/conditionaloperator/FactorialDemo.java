package conditionaloperator;

import java.util.Scanner;

public class FactorialDemo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, fact=1;
		
		System.out.print("Enter any positive number n: ");
		
		num = input.nextInt();
		
		for(int i = num; i>=1; i--) {
			
			System.out.print(" "+i);
			fact = fact*i;
		}
		
		System.out.println();
		System.out.println("n! Factorial of "+num+" is: "+fact);
	}

}
