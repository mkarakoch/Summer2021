package selfexercises;

public class SwapQuestionsEx {

	public static void main(String[] args) {
		
		/*
		 Swap the values of two integer 
		 
		 a = 12; b = 5; -> a = 5;  b = 12; 
		 
		 
		 */
		
		int a =23;
		
		int b = 12;
		
		int temp = 0;
		
		temp = b;
		
		b = a;
		
		a = temp;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		
		int x = 4;
		
		int y = 6;
		
		x = x+y;//10
		y = x-y; //4
		
		x = x-y;
		
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
	}

}
