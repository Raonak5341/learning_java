package controlstatement;

import java.util.Scanner;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.print(" Enter age: ");
		age = input.nextInt();
		
		if(age==18) {
			
			System.out.print("Valid voter");
		}
		else if(age>18) {
			System.out.print("Valid voter");
		}
		else {
			System.out.print("Invalid voter");
		}
	}

}
