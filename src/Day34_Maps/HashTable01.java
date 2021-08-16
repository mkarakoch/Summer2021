package Day34_Maps;

import java.util.Hashtable;

public class HashTable01 {
	/*
	   1- Hash Table is thread- safe and syncronized
	   2- Puts in Random order
	   3- 
	 */

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		ht1.put(100, "Ali");
		ht1.put(101, "Veli");
		ht1.put(102, "Can");
	//	ht1.put(null, "XXXXX"); // Throws NullPointer Excception
		//ht1.put(103, null);// Throws NullPointer Excception
		
		System.out.println(ht1);
		
		

	}

}
