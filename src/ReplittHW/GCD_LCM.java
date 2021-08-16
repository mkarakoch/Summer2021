package ReplittHW;

public class GCD_LCM {
	/*
	 Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple) 
	
	Input : 
		
	30 and 40
		
	Expected OutPut:
		
	GCD for 30 and 40 = 10
	
	LCM for 30 and 40 = 120
	 */

		
	

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		
		for ( int i =a; i>1 ;i--) {
			if ( a%i==0 && b%i==0) {
			System.out.println("GCD for "+ a + " and " + b + " = " +i);
		break;
		}
	}
		for ( int i= a; i<a*b ; i++) {
			if (i%a==0 && i%b==0) {
				 System.out.println("LCM for " + a + " and " + b + " = " + i);
	                break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
