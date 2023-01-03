package basicjava;

public class FormatSpecifier {
	
	public static void main(String[] args) {
		
		boolean b = true; //dynamic initialisation
		int i = 1234;
		char c = 'a';
		short s = 12667;
		float f = 10.2f;
		double d = 10.2134678;
		
		System.out.printf("Boolean b = %b\n",b);
		System.out.printf("Integer i = %d\n", i);
		System.out.printf("Character c = %c\n",c);
		System.out.printf("Short s = %d\n",s);
		System.out.printf("Float f = %.2f\n",f);
		System.out.printf("Double d = %.3f\n",d);
		
		
	}

}
