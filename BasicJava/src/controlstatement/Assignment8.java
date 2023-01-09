package controlstatement;

import java.util.Scanner;

public class Assignment8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char answer, answer2;
		
		System.out.println("Have you completed your masters? y/n");
		answer = input.next().charAt(0);
		
		System.out.println("Are you fluent in English? y/n");
		answer2 = input.next().charAt(0);
		
		if(answer == 'y' && answer2 == 'y') {
			
			System.out.print("You are eligible for the job interview.");
		}
		else if(answer == 'n' && answer2 == 'n') {
			System.out.print("Sorry. you are not eligible to for the job interview");
		}
		else if(answer == 'y' && answer2 == 'n') {
			System.out.print("Sorry. you are not eligible to for the job interview");
		}
		else if(answer == 'n' && answer2 == 'y') {
			System.out.print("Sorry. you are not eligible to for the job interview");
		}
		
	}

}
