package StaticKeyword;

public class StaticBlock {
	/*
	 static cariable : Class variable, it is attached to the class and you should use class name to access.
	 static method : They belong to the class, you should use class name to access. 
	 
	 Static Block:  1- It is used to initialize " class ( static ) variables"
					2- Static block Executes before everything ( constructors, methods, main method inside the class 
	 				3- If you have multiple static blocks, first one runs first
	 				
	 */
	
	// I did not use static block to initialized 
	static int age = 12; 
	
	// I did use static block to initialized 
	static int year;	
	static {
		year = 2021;
	}
	
	static {
		System.out.println("Static block 1");
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	static {
		System.out.println("Static block 3");
	}
	public static void main(String[] args) {
		
		method1();
		System.out.println("Main");
		method2();
		StaticBlock obj1 = new StaticBlock();
		
	}
	
	public static void method1() {
		System.out.println("Method 1");
	}
	
	public static void method2() {
		System.out.println("Method 2");
	}
	
	StaticBlock(){
		System.out.println("Constructor");
	}
}