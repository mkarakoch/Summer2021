package day14methodoverloadingconstruction;


	
	
	/*
	 There are 3 main variable types in Java 
	 a) Local Variables : They are created inside a method body
	 					  You have to initialize it  (Assigning a value ) local variable
	 					  When you create a variable, Java uses default values for the variables,
	 					  but if the variable is local var Java doesnot use default
	 					  otherwise when u try to use local var Java complains
	 					  
	 b)Instance (Object) Variables: if you create a variable outside the method and inside the class without using "static"
	 								keyword, it is called “instance(object) variable”
	 							-  Instance variables may initialize or not.
	 							-  if you do not initialize, java uses default value for the variable
	 							
	 c) Class Variables
	 */
public class VariebleTypes01 {
	// This location used for instance variable
	// Class variable created outside the methods,inside the class
	// To initialize is option
	/*
	 Class variable are attached to the class, not to the object 
	 
	 */
	String name = "MK";
	char c;

	
	static String address = "Boston USA ";
	
	
	public static void main(String[] args) {
		// Local Var
		int y =11;
		//Local var wiithout initializing
		int z;
		// when u try to use non initialized loocal var, Java complains
		//System.out.println(z);
	
		
		/*
		 When u try to use instance variable inside the main methif  it is complains
		 bec main method is static and static method do not accept non static things in it 
		 */
		//System.out.println(c);
		
		System.out.println(address); // no complains bec it is static
		
		
		
	}
	
		public int add (int a , int b) {
			int x = 12;
			System.out.println(c);
			return a+b;
			
			 
		}
	
	
		 
	}


