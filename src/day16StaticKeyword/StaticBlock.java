package day16StaticKeyword;

public class StaticBlock {

	
	static int age;
	static int year= 2021;
	
	static {  
		// We use static block to initialize our static variables 
		// if you have more than one static block the first one will run first. it will run in order
		age=29;
		
	}
	
	
		static {
			System.out.println("Static1");
		}
		static {
			System.out.println("Static2");
		}
		static {
			System.out.println("Static3");
		}
		
		
	public static void main(String[] args) {
		test1();
		System.out.println("This is my main method");
		test2(); 
	}
	
	public static void test1 () {
		System.out.println("test1");
		
	}
	public static void test2 () {
		System.out.println("test2");
		
	}
	public static void test3 () {
		System.out.println("test3");
		
	}

}
