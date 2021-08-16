package day30exceptionsinterfacesiteratorscollections;

/*
 Interface is not a class, interface is an interface. 
 Interface is a storage for abstract methods and public static final variables
 Interface is practically multiple parents, java does not accept multiple inharitance therefore
 		java created interface to accept multiple inharitance
 interface dooes not have constructors, because of that we cant create object in interfaces
 All variables in an interface are aoutomatically "public " , "static and "final"
 
 */

public interface I01 {
	
								// VARIABLES
	
	int x = 12;
	public int y = 12;
	
	// c variable is final automatically therefore we cant change its value
	char c = 'A';
	// d is complaining because it is final and final variables must be initialized
	//char d;
	
// To access to AliCan just by usinf interface name, no need to create any object to access Ali Can 
	//because, all variables are static in interfaces 
	String s = "Ali Can";
	
	
	//All of the given variables are same
	int m = 13;
	public int n = 14;
	public static int t = 13;
	public static final int u = 16;
	
									// METHODS
	
	// in interfaces all methodsa are abstract as default
	// if you want you may use "abstract" keyword or not
	// In interface all methods are puublic as default 
	
	 void add(int x, int y);
	 	abstract void divide (int x, int y);
	
	
	// untill java 9 using concrete method in interface was not possible, 
	// in java9 java made update and let us to use concrete methods as well 
	
	//1.st way to create concrete method in an interface 
	// use "default" keyword it is not access modifier, it is a specific keyword for interfaces 
	// if you use default  or static keyword it means the method has a default umplementation
	// Like in abstract classes, if you  create a concrete method in interface, it is not must to override
	default void product (int x , int y) {
		
		System.out.println("result: " + x*y);
	}
	
	//2. way  to create concreate  method in an interface 
	// Use static keyword
	// If you use static or default keyword it means the method has a "default implementation"
	//like in abstract classes if you create  a concreate method in interface, it is not must to override
	
	static void substract (int x, int y) {
		System.out.println("Result is : " +( x-y));
		
	}
}
