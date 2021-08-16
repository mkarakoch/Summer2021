package ReplittHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javaiseasy {

	public static void main(String[] args) {
		/*	Write a code that returns the duplicate chars from
		 *  Javaisalsoeasy
		  in a String array of .(interview Question)

			Input : 
				 
			String str=�Javaisalsoeasy� 

			Output: [a, s]
	
	*/

		String str = "Javaisalsoeasy";
		
		char a [] = str.toCharArray();
		Arrays.sort(a);
		
		List<Character>uniquechars = new ArrayList<>();
		
		
		for ( int i = 0; i<a.length-1; i++) {
			if ( a[i]==a[i+1] && !uniquechars.contains(a[i]) ) {
				uniquechars.add(a[i]);
				System.out.println(uniquechars);
				
			}
		}
		
	
		
		
		
		
		
		
		
		
	}

}
