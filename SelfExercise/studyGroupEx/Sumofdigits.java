package studyGroupEx;

public class Sumofdigits {

	public static void main(String[] args) {
		
	//	System.out.println(findIt ( new int [] {3,5,6,9,7}));
	//	System.out.println(numapp ( new int [] {3,5,6,9,7}, 8));
		
		
		 
	}
	
	
	/* 
	 * Digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
	 */
	
		public static int digroot (int n ) {
		
		
			n=125635;
			
			return (n%9==0 && n!=0 )? 9: n%9;
			
			
			
	}
		
		// Given an array of integers, find the one that appears an odd number of times.
				//There will always be only one integer that appears an odd number of times.
		
	// 	burada yukarida ki soruya nasi methot yazilir, sadece method yazma 
		
		
		public static int findIt(int[] a) {
	        int odd=0;
	        for(int i=0; i<a.length;i++) {
	            if(numapp(a, a[i])%2!=0) {
	                odd=a[i];
	            }
	        }return odd;
		}
		
	  
	    
	    
	    static int numapp(int[]a, int x) {
	        int counter=0;
	        for(int i=0; i<a.length;i++) {
	            if(a[i]==x) {
	                counter++;
	            }
	        }return counter;
	    }
		// 2 sininde returnleri main methodda 
	}


