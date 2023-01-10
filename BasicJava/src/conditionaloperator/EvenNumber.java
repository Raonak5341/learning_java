package conditionaloperator;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int m, n, i, sum=0;
		
		System.out.print("Enter initial Number: ");
		m = input.nextInt();
		
		System.out.print("Enter final Number: ");
		n = input.nextInt();
		
		for(i=m;i<=n;i++) {
			
			if(i%2==0) {
				sum = sum+i;
				System.out.print("  "+i);
				
			}
			
		}
		System.out.println();
		System.out.println("Sum of Even Number: "+sum);
	}

}
