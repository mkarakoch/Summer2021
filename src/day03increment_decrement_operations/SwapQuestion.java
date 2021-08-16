package day03increment_decrement_operations;

public class SwapQuestion {

	public static void main(String[] args) {
		/*
		 Swap the values of two integer 
		 
		 a = 12; b = 5; -> a = 5;  b = 12; 
		 
		 
		 */
/*
		int  a = 12;
		
		int b = 5;
		
		int c = 0;
		
		System.out.println("Before the swap a is " + a);
		System.out.println("Before the swap b is " + b);
		
		// assign b to temp
		c = b;
		
		
		
		// assign a to b 
		b = a;
		
		
		
		//assign temp to a 
		a = c;
		
		System.out.println("After the swap a is " + a);
		System.out.println("After the swap b is " + b);
		*/
		//2. way do not use 3.rd container 
		
		int c = 20; // I need to en up c is 15
		int d = 15;// d is 20 
		
		c=c+d; // 35
		
		d=c-d; // 20
		
		c=c-d;
		
		System.out.println("After the swap c is " + c);
		System.out.println("After de swap d is " + d);
		
		
		
		
	}

}
