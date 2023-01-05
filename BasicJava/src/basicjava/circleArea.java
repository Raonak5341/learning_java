package basicjava;

import java.util.Scanner;

public class circleArea {
	
	public static void main(String[] args) {
		
		double radius, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		radius = input.nextDouble();
		
		area = 3.1416 * radius * radius;
		
		System.out.print("The Area of circle: "+area);
	}

}
