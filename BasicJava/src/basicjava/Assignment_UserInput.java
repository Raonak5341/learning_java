package basicjava;

import java.util.Scanner;

public class Assignment_UserInput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		int id, price;
		System.out.print("Enter ID number: ");
		id = input.nextInt();
		
		System.out.print("Price: ");
		price = input.nextInt();
		
		String title, description, category;
		System.out.print("Enter title: ");
		title = input1.nextLine();
		
		System.out.print("Description: ");
		description = input1.nextLine();
		
		System.out.print("Category: ");
		category = input1.nextLine();
		
		System.out.println(" ");
		System.out.println("ID: "+id);
		System.out.println("Title: "+title);
		System.out.println("Price: "+price);
		System.out.println("Description: "+description);
		System.out.println("Category: "+category);
		
	}

}
