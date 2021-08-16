package OfficaadvanceClass2962021;

public class FindingDivisionWithSubstraction {

	public static void main(String[] args) {
	
		/*
         * Interview Question :
         *
         *
         * write a return method that can divide two numbers without division operator
         * and prints quotient and remainder
         *
         * Input : number= 44 and divisor=5
         * Output : Quotient=8 Remainder=4
         */

		int input = 44; 
		int divisor =5;
		division(input,divisor);
		
	}
		
		public static void division (int input, int divisor) {
			int qoutient=0;
			int remainder=input;
			
			while (remainder>=divisor) {
				remainder-=divisor;
				qoutient++;
				
		}
		System.out.println("Quotient = " + qoutient + " and remainder = "  + remainder );
		
	}

}
