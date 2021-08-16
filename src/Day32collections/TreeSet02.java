package Day32collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		/*
		  We need to store unique elements in natural order
		  Treeset is super slow. Therefore it is not recomended
		  
		  
		  
		  
		  2. Way is HashSet to add elements thnen converts HasSet to TreeSet to put
		  		the elements in natural order
		  		
		 */
		
		HashSet<String> hs1 = new HashSet();
		
		hs1.add("Apple");
		hs1.add("Mango");
		hs1.add("Orange");
		hs1.add("Palm");
		hs1.add("Apricot");
		
		System.out.println(hs1);
		
		TreeSet<String> ts1 = new TreeSet<>(hs1);
		
		System.out.println(ts1);
		
		

	}

}
