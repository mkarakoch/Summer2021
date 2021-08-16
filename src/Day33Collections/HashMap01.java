package Day33Collections;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 1 HashMap doenst put elements any order.
	  Therefore it is faster
	  
	 2 Keys must be unique in Maps, otherwise Java will overwrite
	 
	 3 Values can be repeated in Maps
	 
	 4 We can use  null Keys but you can use it just in once 
	 	 we can use null in Values repeatedly 
	 	 
	 5 HashMaps are not thread-safe and not sycronized
	 
	 
	  
	  
	 */

	public static void main(String[] args) {


		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		hm1.put(100, "Kemal Kuzu");
		hm1.put(104, "Angie Ocean");
		hm1.put(null, "Angie Ocean");
		hm1.put(null, "Deleloy");// overriden of null Angie Ocean 
		hm1.put(105, null);
		hm1.put(106, null);
		hm1.put(107, null);
		
		
		System.out.println(hm1);
		
		
		System.out.println(hm1.get(100));//Kemal Kuzu 
		
		System.out.println(hm1.get(108));
		
		System.out.println(hm1.getOrDefault(108, "No Value for that key"));
		
		// returns the keys in set collection
		
		System.out.println(hm1.keySet());// [null, 100, 101, 102, 103, 104, 105, 106, 107]
		
		System.out.println(hm1.values());// [Deleloy, Kemal Kuzu, Veli Han, Mark Stone, Angie Ocean, Angie Ocean, null, null, null]
		
		
		
		// true if this map contains a mapping for the specified key
	    
		System.out.println(hm1.containsKey(108));//false
		System.out.println(hm1.containsKey(104));//true
		
		
		System.out.println(hm1.containsValue("Veli Han")); //true
		System.out.println(hm1.containsValue("XXX XX"));///False
		
		

		HashMap<Integer, String> hm2 = new HashMap<>();
		
		hm1.put(108, "X");
		hm1.put(109, "Y");
		hm1.put(110, "Z");
		
		
		hm1.putAll(hm2);
		
		//if element is exist, doesnt change existing value otherwise creates new value 
		
		hm1.putIfAbsent(111, "Mamicillo");
		hm1.putIfAbsent(null, "ZZZZZZZ");
		hm1.putIfAbsent(106, "LLLLLLLL");
		
		
		// replace()  is used to update valueby using key
		// replace() with a non exising key, it will do nothing 
		hm1.replace(106, "OOOOOOOOOO");
		hm1.replace(112, "?????");
		
		
		// Followong replace ()  does check for key and vlaue, if both match then it will update
		hm1.replace(106, "OOOOOOOOOO", "fikifiki");
	
		System.out.println(hm1);
		
		System.out.println(hm1.size());
		
		
		

	}

}
