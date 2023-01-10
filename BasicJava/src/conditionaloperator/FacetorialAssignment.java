package conditionaloperator;

import java.util.Scanner;

public class FacetorialAssignment {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, fact=1, i;
		
		System.out.print("Enter a number n : ");
		n = input.nextInt();
		
		for(i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		System.out.println("Factorial n! = "+fact);
	}
	

}
