package Day34_Maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		
		
		/*
		 		How to count the number of occurances of the words in a sentence
		 		
		 		" Java is easy. Type codes to learn Java. To earn money learn Java.
		 			Java=3 , easy=1, Type= 1, ...., learn=2 ... 
		 		
		 */
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		System.out.println(str);
		str=str.replaceAll("\\p{Punct}", "").toLowerCase();
		
		System.out.println(str);
	
	
		
		HashMap<String, Integer> result = new HashMap<>();
		// to get everyword I should split the spaces 
		
		String words [] = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		for (String w: words) {
			Integer numOfwords = result.get(w);
			
			
			if (numOfwords==null) {
				result.put( w, 1 ); 
			}else {
				result.put(w, numOfwords +1);
				
			}
			
		}
	System.out.println(result);
	
	/*HW 
	 
	 
	 Typecode to see the number of occurences of characters in a given String
	 
	 
	 */
	
	
	
	
	}
}
