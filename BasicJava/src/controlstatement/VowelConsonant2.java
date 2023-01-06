package controlstatement;

import java.util.Scanner;

public class VowelConsonant2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.print("Enter a character: ");
		ch = input.next().charAt(0);
		
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			System.out.print("Vowel");
		}else {
			System.out.print("Consonant");
		}
	}

}
