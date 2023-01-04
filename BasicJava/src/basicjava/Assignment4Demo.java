package basicjava;

import java.util.Scanner;

public class Assignment4Demo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int noOfInstallments, InstallmentPerMonth;
		
		int phonePrice = 1800; //euros
		
		System.out.print("Enter number of installments: ");
		noOfInstallments = input.nextInt();
		
		InstallmentPerMonth = phonePrice/noOfInstallments;
		
		System.out.println("Monthly Installments: "+InstallmentPerMonth+" euros");
	}

}
