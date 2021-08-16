package selfexercises;

public class Variabl01ex {
	
	/* 
	 * 1- Project --> Package --> Class--> Variables + Methods
	 * 2- How to create " variables "
	      Type data type 
	      Type a name for the variable 
	      "=" 
	      Value
	      
	      3- data types;
	      
	      a. int --> integer: Whole numbers ; 1,2,15,394
	      
	      	double --> decimals: Range is larger  
	      	float  --> decimals: Range is smaller than double's range 
	      
	 */
	
	/*
	  If you create a variable inside a method, you should "initialize" it. 
	  " int price;" means you created a variable 
	  "= 100 meaning you initialized it
	  Note: If you want to see default values create the variables outside the methods.
	  
	  If a method is static everything inside the method should be static 
	  Therefore, syso is inside the method which is static, so price2 variable should be static.
	  
	  Default Values: If you don't assign a value, Java gives default value for the variable.
	  
	  
	  					Primitive Data types	
	 Default Values:
	 
	 1. byte =>0	 
	 		Note bytes are whole numbers from -128 to 127
	 2. short => 0 
	  		Note: Short's are whole numbers from -32768 to 32768
	 3. int = 0	 
	 		Note: Whole numbers
	 4. long =>0
	  		Note long is a whole numbers
	 5. float = 0.0
	 		// the value is 0.0 write f or F at the end
	 6. double = 0.0
	 		// the value is 0.0
	 7. char = single characters
	 		Note default value of char is null/nothing or '\u0000'
	 8. boolean=> true or false 
	 		// defalult value for boolean is false
	  	
	  		
	  	Order numbers from smaller range to larger range
	  	
	  		byte < short < int < long < float < double
	 */
	
	static int price2; // default value
	static double minSalary; // the value is 0.0
	static float hourlySalary;
	static char couple;// default value of char is null/nothing or '\u0000'
	static boolean isAge; // defalult value for boolean is false
	
	
	public static void main(String[] args) {
		
		int price1 = 541;
		
		double salary = 2.300;		
		float weeklySalary=7.452f; // if you don't add f at the end java thinks it is double. adding f at the end we 
		char initial = 'S'; // U have to use single code
		char initial2='#';
		char initial3=' ';
		byte age = 78;
		short populationOfCity= 25000;
		boolean isNew= true;
		boolean isRetired=false;
		String name = "Apo";
		String digit = "4853";// u cantdo math operation 
		String fname = "Muhammet Emin";
		String password = "Mamicillo01,,";// passwords username emails, used by String
		Integer a= 0;
		long yuppi = 9;
		
		
		
		
		
		
		
		
		
		System.out.println(a.MAX_VALUE);//2.147.483.647
		
		System.out.println(weeklySalary);		
		System.out.println(price1);
		System.out.println(salary);
		System.out.println(price1*salary);
		System.out.println(initial);
		System.out.println(initial2);
		System.out.println(initial3);
		System.out.println(couple);//displays nothing, default value of char is null/nothing, or '\u0000'
		System.out.println(age);
		System.out.println(populationOfCity);
		System.out.println(isNew);
		System.out.println(isRetired);
		System.out.println(name);
		System.out.println(digit);
		System.out.println(fname);
		System.out.println(password);
		System.out.println(yuppi);
	
		System.out.println();
		
		
		System.out.println(price2); // syso is inside the method which is static, so price2 variable should be static. 
		System.out.println(minSalary);		
		System.out.println(hourlySalary);
		System.out.println(isAge);
		
			
			
			
			
			
			
			
			
	}
		
			

		

}
