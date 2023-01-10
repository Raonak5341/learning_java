package conditionaloperator;

import java.util.Scanner;

public class Assignment12SumOfOddNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int m, n, sum=0, i;
		
		System.out.print("Enter Starting Number m: ");
		m = input.nextInt();
		
		System.out.print("Enter Ending Number n: ");
		n = input.nextInt();
		
		
		for(i=m; i<=n; i++){
			
			if(i%2 != 0) {
				
				
				sum = sum + i;
				System.out.print(" "+i);
			}
		}
		
		System.out.println();
		System.out.println("Sum of odd numbers: "+sum);
		
		
	}

}
