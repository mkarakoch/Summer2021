package PracticeClassday11EX;


/*
 	Whole numbers are accepted as int for Java as default
 	Decimal numbers are accepted as double for Java as default
*/

public class Methodoverloadin01ex {

	public static void main(String[] args) {
		add (2,3);
		add(2.5,3);
		add(3,2.5);
		add(3, 5, 7);
		add(3 , 5, 8, 12, 10.80);    
		

	}
	
	
	public static int add ( int ...a ) {
		System.out.println("I am using varargs");
		return 1;
		
	}
	public static double add ( int a, int b) {
		
		System.out.println("int + int");
		return 1;
		
	}
		
	public static double add (double a, int b) {
	System.out.println( "double + int ");
		return a+b ;
		
	}
	
	public static double add ( int a, double b) {
		
		System.out.println("int + double ");
		return a+b;
		
	}
	
	public static int add ( int a, int b, double c) {
		System.out.println("int + int + double");
		return a + b;
	}
	
	public static double add ( int a, int b, int c, int d, double e ) {
		System.out.println("int + int + int + int + double");
		return (a + b + c + d + e);
		
	}
	

}
