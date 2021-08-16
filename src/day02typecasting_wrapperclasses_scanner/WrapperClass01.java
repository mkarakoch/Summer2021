package day02typecasting_wrapperclasses_scanner;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		
		/*
		 
		  primitive 		Wrapper Class ( Non-Primitive)
		  byte				Byte
		  short				Short
		  int				Integer
		  long				Long
		  float				Float
		  double			Double
		  boolean			Boolean
		  char				Character
		  
		 */
		
		int a = 11;
		
		Integer b = 12;
		System.out.println(b.MAX_VALUE); //214748...
		System.out.println(b.MIN_VALUE);//-214...
		System.out.println(b.min(12,23));
		
	System.out.println(b.compare(25,64));//-1 bec first value is smaller
	
	System.out.println(b.compare(64,25));//1 bec first value is larger 
	System.out.println(b.compare(64,64));//0 bec values are equal 	
		
	//Create a Short Wrapper Class variable
	//a)Print the max and min values of short data type on the console
	//b)Use any method and try to understand the logic of the method
	
	
	Short c = 33;
	System.out.println(c.MAX_VALUE);//32767
	System.out.println(c.MIN_VALUE);//-32768
	
	
	System.out.println(c.SIZE);//16 -> Meaning c is used 16 bit in the memory 
	
	System.out.println(c.hashCode());//33 hashcode means adress of the non-primitive 
	System.out.println(c.toString());//33 
	
	Short d = 33;
	System.out.println(d.equals(c));
	
	Short e = 45;
	
	System.out.println(e.equals(d));
	
	
	//Autoboxing
	
	
	int x = 12;
			
	Integer y = x; 
	
	System.out.println(x);
	System.out.println(y);
	
	
	// Unboxing 
	
	Integer z = 23;
	int t = z;
	
	
	System.out.println(z);
	System.out.println(t);
	
	
	
	
	

	}

}
