package basicjava;

import java.util.Scanner;


public class IntegerInputDemo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Taking integer input from user
		int number;
		System.out.print("Enter any number : ");
		number = input.nextInt();
		
		System.out.println("Number = "+number);
		
		
		
		
	}

}
