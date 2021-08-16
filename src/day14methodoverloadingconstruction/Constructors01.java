package day14methodoverloadingconstruction;

public class Constructors01 {
	int  a ;
	
	
	/*What is the difference btw constructure and methods 
			cons do not have return type but methods does 
			
		Default Constructor is constructor without parameters like public class Constructors01 { } 
			
	 */
			

	public static void main(String[] args) {
	}
	
	public int add (int a, int b) {
		return a+b;
		
		
		
		
		
	}
		public  Constructors01() { // constructorss re not methods bec they dont have return type
			this.a = a;
			
	}
		
		public  Constructors01(int a) {
			
		}
		
		public  Constructors01(int a, String s) {
			
		}
		public  Constructors01(char a, double d, String s) {
			
		}
}
