package Day34_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap02 {

	public static void main(String[] args) {
		
		/* How to iterate in HashMap
		  
		  
		  1. way use for each loop and Map.entrySet()
		  
		 */
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		System.out.println(hm1); // {100=Ali Can, 101=Veli Han, 102=Mark Stone, 103=Angie Ocean}
//		for (Map.Entry<Integer, String> w: hm1.entrySet()) {
//			
//			System.out.print(w.getKey()+ " ");
//		
//			System.out.println(w.getValue() + " ");
			
			//2. way
			
			Iterator<Map.Entry<Integer, String>> hm1iItr = hm1.entrySet().iterator();
			
			while (hm1iItr.hasNext()) {
				Map.Entry<Integer, String> entry = hm1iItr.next();
				
				System.out.print(entry.getValue() + " ");
				System.out.println(entry.getKey());
			}
			
		}
 
	}


