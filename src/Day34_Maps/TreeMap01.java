package Day34_Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {
	
		
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		tm1.put(105, "Ali");
		tm1.put(101, "Veli");
		tm1.put(103, "Kaan");
		tm1.put(102, "Eric");
		tm1.put(104, "John");
	// 	tm1.put(null, "XXXX");   Throws Null Pointer Exp
		tm1.put(106, null);
		tm1.put(107, null);
		 
		System.out.println(tm1);
		
		
		//Add elements by using hashMap then converting to TreeMap
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		
		hm2.put(10, "AAA");
		hm2.put(13, "CCC");
		hm2.put(11, "BBB");
		hm2.put(12, "YYY");
		hm2.put(16, "AAA");
		hm2.put(17, "CCC");
		hm2.put(18, "BBB");
		hm2.put(15, "YYY");
		
		TreeMap<Integer, String> tm2 = new TreeMap<>(hm2);
		
		System.out.println(tm2);
		
		System.out.println(tm2.ceilingEntry(15));//15=YYY
		System.out.println(tm2.ceilingEntry(9));//10=AAA
		System.out.println(tm2.ceilingEntry(19));//null
		
		System.out.println(tm2.ceilingKey(15));//15
		System.out.println(tm2.ceilingKey(9));//10
		System.out.println(tm2.ceilingKey(19));
		
	}

}
