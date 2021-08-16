package day01variable;

public class Variable01 {
	
/*
 1)project -->package-->class--> Variable + methods
 2) How tho create "variables"
 	a)Type data type 
 	b)Type a name for the variable
 	c)"="
 	d)Value
 3) Data Types;
 	a) "int" --> integer: whole numbers like 2,3244,-432,0
 	b)"double" --> decimals: Range is larger
 	c)"float" --> decimals:range is smaller than double's range  
 */
	
	/* 
	 Note if you create a variable inside a method, you should " initialize" it.
	 "int price1" means you created a variable 
	 "=100 means you initialized the variable 
	 Note: If you want to see a default variables create the values outside the methods.
	 Note: if a method is static, everything inside the method is static.
	Note: if you don't assign any value for a variable java uses default values for them. Default values for
		a) int-> 0
		b)double -> 0.0 
	 	c)float : 0.0 -> when you assign a value a float numbers use f at the end of the decimal number. 
	    d)char: nothing or '\u0000'
	    e) byte: 0
	       Notes e)byte ==> 0
                Note: byte's are whole numbers from -128 to 127
              f)short ==> 0
                Note: short's are whole numbers from -32768 to 32767
              g)long ==> 0 
                Note: long's are whole numbers from -9,223,372,036,854,755,808 
                to 9,223,372,036,854,755,807
	    
	   byte < short < int < long < float < double 
	   
	   h) boolean : this data types used only "true" or "false" values 
	 * 

	 * */
	
	
	static int price2;
	static double minSalary;
	static float hourlySalary; 
	static char single; 
	static boolean isOld; 

	
	public static void main(String[] args){
		
		// if you create a variable inside a static 
		
		int price1 = 100;
		
		float weeklySalary = 1.234f;
		double salary = 2.34; 
		char initial = 'S';
		boolean isNew = true; 
		boolean isRetired = false; 
		String name = "Muhammet 768"; 
		short populationOfAVillage = 3900;
		byte age = 53;
				
				
				
		System.out.println(price1);
		System.out.println(salary);
		
		System.out.println(price1*salary);
		
		System.out.println(price2);
		
		System.out.println(minSalary); 
		
		System.out.println(hourlySalary);
		
		System.out.println(weeklySalary); 
		System.out.println(isOld);
		System.out.println(name);
		System.out.println(isNew); 
		System.out.println(isRetired);
		System.out.println(initial);
		System.out.println(populationOfAVillage);
		System.out.println(age); 
		
	}
	
	
}
