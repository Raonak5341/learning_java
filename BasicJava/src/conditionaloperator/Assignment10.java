package conditionaloperator;

public class Assignment10 {
	
	public static void main(String[] args) {
		
		//find sum of 1-10 using for /while/do while loop
		
		int i=1, sum=0;
		
		do{
			sum = sum+i;
			i++;
		}while(i<=10);
		
		System.out.println("The sum is: "+sum);
		
	}
}
