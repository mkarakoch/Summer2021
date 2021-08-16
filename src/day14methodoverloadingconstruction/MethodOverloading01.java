package day14methodoverloadingconstruction;
/*
 Whole numbers are accepted as int for JAVA as default 
 Decimal numbers are accepted as double for Java as default
 */

public class MethodOverloading01 {

	public static void main(String[] args) {
		add(2,3);
		add(2.5,3);
		add(3,2.5);
		add(3,6,5.2);
		add();
		add(3);
		add(3 , 5);
		add(3 , 5, 8);
		add(3 , 5, 8,12, 10);
		
		
		/*
		 I created a method to add 2 values and I created a different method to add 3 values
		 if user wants to add 4 values I add one more method but this is not sensible because it is endless.
		 
		 Java created "varargs", varargs accept any values numbers.
		 */

	}
	
	public static int add ( int ...a ) {
		System.out.println("I am using varargs");
		return 1; 
	}
	
	
public static double add (int a, int b ) {
	System.out.println("int + int");
	return a+b;
		}

public static double add (double a, int b ) {
	System.out.println("double + int");
return a+b;
}

public static double add (int a, double b ) {
	System.out.println("int + double");
return a+b;
}

public static double add (double a, double b ) {
	System.out.println("double + double");
return a+b;
}


public static double add (int a, int b, double c  ) {
	System.out.println("int + int + double");
	return a+b;
		}























}
