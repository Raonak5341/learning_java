package controlstatement;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int digit;
		
		System.out.print("Enter any digit: ");
		digit = input.nextInt();
		
		switch(digit) {
		case 0:
			System.out.print("Zero");
			break;
		case 1:
			System.out.print("One");
		case 2:
			System.out.print("Two");
		case 3:
			System.out.print("Three");
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;
		default:
				System.out.print("Not a digit");
			
		}
		
	}

}
