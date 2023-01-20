package conditionaloperator;

import java.util.Scanner;

public class AssignmentFibonacci {
	
	public static void main(String[] args) {
		
		System.out.print("which fibonacci number you want to see? ");
		Scanner input = new Scanner(System.in);
	      int n = input.nextInt();
	      int i, f, s;

	      f = 0; //first fibonacci number
	      s = 1; // second fibonacci number

	      System.out.print(f + " " + s + " ");
	      for (i = 3; i <= n; i++) { 
	        int fibonacci = f + s;
	        System.out.print(fibonacci + " ");
	        f = s;
	        s = fibonacci;
	      }
	    }
		
	}


