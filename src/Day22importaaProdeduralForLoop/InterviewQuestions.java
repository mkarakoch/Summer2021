package Day22importaaProdeduralForLoop;

public class InterviewQuestions {
	
	
	
	static int sumofnumbers (int num) {
		
		//1. Write a method that returns the sum of numbers starting with 1 to the number passed 
	//into the method.
				
		int sum = 0;
		
		for (int i = 1; i <=num; i++) {
			sum+=i;//sum=sum+i
			
		}
		return sum;
		
		}
	
	// //2. Write method that accepts a String and removes all duplicate from String. 
		//EX : aaabbc --> abc
	
	
	static String removeDuplicates(String str){
	    String result = "";
	    for(int i = 0; i < str.length(); i++){
	        char eachLetter = str.charAt(i);
	        if(!result.contains(eachLetter + ""))
	            result += eachLetter;
	    }
		return result;
	    
	}
	
	
	
	static  String isReverse(String reverse ) {
		String reverseString="";
		
		for (int i = reverse.length()-1; i>=0 ;i--)
			reverseString+=reverse.charAt(i);
	
		return reverseString;
		
	}
	public static void main(String[] args) {
		System.out.println(sumofnumbers(15));

		System.out.println(removeDuplicates("ayata"));
	System.out.println(isReverse("a"));
	
	
	
	
	
	
	
	
	
	
	

	}

	
	

}
