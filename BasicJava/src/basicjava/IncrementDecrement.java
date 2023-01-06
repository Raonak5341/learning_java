package basicjava;

public class IncrementDecrement {
	
	public static void main(String[] args) {
		
		int x = 25;
		int y;
		
		y = x++;//post increment
		System.out.println("y = "+y);// as it is post increment, it doesn't increased at first use
		y = x;
		System.out.println("y = "+y);
		
		
	}

}
