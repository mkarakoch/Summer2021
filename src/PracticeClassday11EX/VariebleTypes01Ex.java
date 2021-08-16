package PracticeClassday11EX;


	
	/*
	 There are 3 main variable types 
	 
	 1- Local Variables : 
	 		- They are created inside a method body 
	 		- Should be initialized 
	 		- When u create a variable JAva uses default variables 
	 			but if u try to use local var java complains 
	 			
	 			
	 2- Instance Variables 
	 		- If u create a variable outside method and inside the class without using " static " 
	 		  				keyword, it is called " instance (object) "variable"
	 		
	 		- instance variables may initialize , java uses default valuse for the variables
	 		
	 		
	 		
	 3- Class Variables
	 */
public class VariebleTypes01Ex {
	// Instance variables created outside the method inside the class
	//it is optional to initialize 
	
	String name = "Ali Can";
	char c;
	
	
	static String address = "Miami USA";
	
	public static void main(String[] args) {
	
		
		// Local variable 
		
		int y = 11; 
		
		// Local variable without initializing 
		
		int  z;
		
		// if you try to use without initialized local variable java complains 
		
		//System.out.println(y);
		
		System.out.println(address);
		
	}
		public int add(int a, int b) {
			// local variable 
			
			int x = 12;
			
			// When you try to use instance variable inside any non-static method, it is fine 
			
			System.out.println(c);
			return a+b;
			
		}
		
		
	}


