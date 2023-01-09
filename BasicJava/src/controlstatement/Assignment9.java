package controlstatement;

import java.util.Scanner;

public class Assignment9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int option;
		
		System.out.print("Enter your option: ");
		option = input.nextInt();
		
		switch(option) {
		
		case 1:
			System.out.print("Selected language is Bengali");
		    break;
		case 2:
			System.out.print("Selected language is Hindi");
			break;
		case 3:
			System.out.print("Selected Language is Urdu");
			break;
			default:
				System.out.print("Selected language is English");
			
		}
	}

}
