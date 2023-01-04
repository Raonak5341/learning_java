package basicjava;

import java.util.Scanner;

public class StringInputDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking string input from user
				String name;
				System.out.print("Enter your name : ");
				name = sc.nextLine();
				
				System.out.println("Welcome : "+name);
	}

}
