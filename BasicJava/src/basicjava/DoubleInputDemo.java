package basicjava;

import java.util.Scanner;

public class DoubleInputDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		System.out.print("Enter any number : ");
		num1 = sc.nextDouble();
		
		System.out.println(num1);
	}

}
