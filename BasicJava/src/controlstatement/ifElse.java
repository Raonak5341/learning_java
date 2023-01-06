package controlstatement;

import java.util.Scanner;

public class ifElse {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		if(num>0) {
			System.out.print("Positive");
		}else {
			System.out.print("Negative");
		}
	}

}
