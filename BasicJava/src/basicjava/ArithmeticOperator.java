package basicjava;

import java.util.Scanner;

public class ArithmeticOperator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, result;
		
		System.out.print("Enter First number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		/*
		num1 = 20;
		num2 = 10;
		*/
		
		result = num1+num2;
		System.out.println("Sum: "+result);
		
		result = num1-num2;
		System.out.println("Sub: "+result);
		
		result = num1*num2;
		System.out.println("Multiplication: "+result);
		
		double result2 = (double) num1/num2; //Type casting
		System.out.println("Div: "+result2);
		
		result = num1%num2;
		System.out.println("Remainder: "+result);
		
	
		
	}

}
