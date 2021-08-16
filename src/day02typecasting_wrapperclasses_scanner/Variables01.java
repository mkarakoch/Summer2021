package day02typecasting_wrapperclasses_scanner;

public class Variables01 {

	public static void main(String[] args) {
		
		// byte < short > int > long > float > double
		/* if you convert a primitive data type to an other, 
		called " Type Casting " 
		 */
		
		
		
		byte age = 65; 
		short newAge = age; 
		
		System.out.println(age);
		System.out.println(newAge);
		
		
		long profit = 2687; 
		int newProfit = (int)profit; 
		//Type code to convert to short 
		
		float code = 2.34f;
		short newCode = (short)code;
		
		short price = 258;
		byte newPrice = (byte)price;
		System.out.println(price);
		System.out.println(newPrice);
		
		short num = 245;
		byte newNum = (byte)price;
		System.out.println(num);
		System.out.println(newNum);
		
		System.out.println(profit);
		System.out.println(newProfit);
		

		System.out.println(code);
		System.out.println(newCode);
		
		// Mathematical operation in Java
		// If data types are different , Java uses 
		//the larger data for the result
		
		int a = 5;
		double b =2;
		int c = 2;
		int d = 3;
		float e = 4.0f;
		
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a/d);
		
		
	
		
		
	}

}
