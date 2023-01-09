package conditionaloperator;

public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		int a = 32;
		int b = 12;
		
		int c;
		
		//Bitwise And
		c = a&b;
		System.out.println("a + b = "+c);
		
		//Bitwise Or
		c = a|b;
		System.out.println("a | b = "+c);
		
		//Bitwise Not
		c = a^b;
		System.out.println("a ^ b  = "+c);
		
		//Right Shift
		c = a>>3;
		System.out.println("a>>3 = "+c);
		
		//Left Shift
		c = a<<3;
		System.out.println("a<<3 = "+c);
	}

}
