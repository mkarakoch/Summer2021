package Day32collections;

import java.util.HashSet;

public class HashSet01 {
/*
   In Hashset elements are sorted randomly, that makes it faster feature
   elements are unique if you try to add repeated elements, ot doesnt give CTE or RTE
   Java overwrites if there is same order in 2 time 
  - HashSet accepts a single null as elements 
  
  Note: If you need a collection for the given features use HashSet;
	 	      a)Unique Elements
	 	      b)Order is not important
	 	      c)Using null is not problem
	 	      d)Speed is important
  
   
   
 */
	public static void main(String[] args) {
		
		
		HashSet<String>hs1 = new HashSet<>();
		
		hs1.add("Apple");
		hs1.add("Mango");
		hs1.add("Orange");
		hs1.add("Banana");
		hs1.add("Apricot");
		hs1.add(null);
		hs1.add(null);
		
		
		System.out.println(hs1);// hashset doesnt put lists in order that makes it faster
		
		
		

	}

}
