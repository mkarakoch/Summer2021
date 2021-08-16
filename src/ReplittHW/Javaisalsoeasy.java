package ReplittHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javaisalsoeasy {

	public static void main(String[] args) {
	/*	Write a code that returns the duplicate chars
	  in a String array.(interview Question)

		Input : 
			 
		String str=�Javaisalsoeasy� 

		Output: [a, s]
		
		

*/
		
	String str = "Javaisalsoeasy";
	char[] ch = str.toCharArray();
	
	
	List<Character>uniqueChars = new ArrayList<>();
	
	Arrays.sort(ch);
	
	for (int i =0; i<ch.length-1 ; i++) {
	
	if (ch[i] == ch[i+1] && !uniqueChars.contains(ch[i])) {
		uniqueChars.add(ch[i]);
		System.out.println();
		
	}
	
	
	}
		
		
	}
}
