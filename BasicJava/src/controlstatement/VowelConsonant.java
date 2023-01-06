package controlstatement;

import java.util.Scanner;

public class VowelConsonant {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.print("Enter a character: ");
		ch = input.next().charAt(0);
		
		if(ch=='a' || ch=='A') {
			System.out.print("Vowel");
		}
		else if(ch=='e' || ch=='E') {
			System.out.print("Vowel");
		}
		else if(ch=='i' || ch=='I') {
			System.out.print("Vowel");
		}
		else if(ch=='o' || ch=='O') {
			System.out.print("Vowel");
		}
		else if(ch=='u' || ch=='U') {
			System.out.print("Vowel");
		}else {
			System.out.print("Consonant");
		}
	}

}
