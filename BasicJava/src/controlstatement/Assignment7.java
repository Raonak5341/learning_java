package controlstatement;

import java.util.Scanner;

public class Assignment7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Do you love java? ");
		ch = input.next().charAt(0);
		
		if(ch=='y' || ch=='Y') {
			
			System.out.print("you are a java lover");
		}
		else if(ch=='n' || ch=='N') {
			
			System.out.print("You are not a java lover");
		}else {
			System.out.print("Invalid answer");
		}
	}

}
