package Varargs;

public class VarargsEX {
	
	public static int add ( int ... a ) {
		
		int sum = 0;
		for ( int w : a) {
			sum = sum+w;
			
		}
		return sum;
		
	}

	
	
	
	
	
	public static void main (String [] args ) {
		
		
	}

}
