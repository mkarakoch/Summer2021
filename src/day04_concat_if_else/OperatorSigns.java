package day04_concat_if_else;

public class OperatorSigns {

	public static void main(String[] args) {
		
		
		
		// "="  sign Assignment Operator in Java
		
		
		int num = 20;
		
		num = 25; 
		
		//"  == " sign or comparison boolean kullanilir 
		
		boolean isTrue = 5 + 2 == 7;
		
		boolean isFalse = 5 + 2 == 8;
		
		System.out.println(isTrue == isFalse); // this says True equals False. it doesnt so it gives False result 
		

		
		//!= Not Equal Sing
		
		
		boolean isTrue1 = 5+2 != 8;
		
		boolean noteq = 5+2 != 23;
		
		System.out.println(isTrue1);
		System.out.println(noteq);
		
		
		
		
		
		// ">" , ">=" , "<" , "<=" ==> All returns boolean
		
		// && and operator .... If you have at least one false result 
		// || Or operation ... If you have just one true the result will be true 
		
		System.out.println(5>8); //False
		
		System.out.println(8>11-5); // True 
		
		
		boolean b1 = 5>2;	  // true 
		boolean b2 = 5==2+3;	// true   
		boolean b3 = 5==2;	   // false
		boolean b4 = 5<2; 		//false
		
		
		
		// to get true && all variables must ben true 
		
		System.out.println(b1 && b2); // both true so result rue 
		
		System.out.println(b1 && b3); //false 
		
		System.out.println(b3 && b4); // false 
		
		
		// || Or 
		System.out.println(b2 || b1); // true bec at least one of the variables is true 
		
		System.out.println(b3 || b4); // false bec all everything is false 
		
		System.out.println(b1 || b2 || b3 || b4); // True bec at least one variable is true 
		
		
		
		
		
	
		
		

	}

}
