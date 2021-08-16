package selfexercises;



public class WrapperClass01Ex {

	public static void main(String[] args) {
		
		
		
		/*
		 Primitive			Wrapper Class ( Non Primitive )
		  
		 * byte				Byte								
		 * short			Short
		 * int				Integer
		 * long				Long
		 * float			Float
		 * double			double
		 * boolean			boolean
		 * char				Character
		 
		 */

		int a = 11;
		
		Integer b = 12;
		
		System.out.println(b.MAX_VALUE);// 2147483647
		System.out.println(b.MIN_VALUE);//-2147483648
		
		System.out.println(b.min(12,32));//12
		System.out.println(b.compare(78, 54));// bec first num is larger
		
		System.out.println(b.compare(45, 78));//-1 bec first num is smaller
		System.out.println(b.compare(8, 8));//0 bec both numb equal 
		
		
		//Create a Short Wrapper Class variable
		//a)Print the max and min values of short data type on the console
		//b)Use any method and try to understand the logic of the method
		
		
			Short m = 67;
			
			System.out.println(m.MAX_VALUE);//32767
			System.out.println(m.MIN_VALUE);//-32768
			
		System.out.println(m.hashCode());//67
		System.out.println(m.SIZE);//16
		
		// Autboxing
		
		int x = 787;
		
		Integer y = x;
		
		System.out.println(x);
		System.out.println(y);
		
		
		//Inboxing
		
		Integer z = 45;
		
		int f = z;
		
		System.out.println(z);
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
