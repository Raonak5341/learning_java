package controlstatement;

import java.util.Scanner;

public class elseIfLadder {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter an integer number: ");
		num = input.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
	}

}
