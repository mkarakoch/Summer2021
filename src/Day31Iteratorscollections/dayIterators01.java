package Day31Iteratorscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class dayIterators01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Can");
		list1.add("Aliye");
		
		System.out.println(list1);//[Ali, Can, Aliye]
		
		for(String w : list1) {
			
			w = w + "!";
			
		}
		
		//By using for-loop we are not able to change the collection elements
		System.out.println(list1);//[Ali, Can, Aliye]
		
		                      //Use Iterator
		
		ListIterator<String> list1itr = list1.listIterator();//[   Ali,    Can,    Aliye,   ]
		
		while(list1itr.hasNext()) {
			String element = list1itr.next();
			list1itr.set(element + "!");
		}
		System.out.println(list1);
	List<String>list2 = new ArrayList<>();
	list2.add("Apple");
	list2.add("Samsung");
	list2.add("Huawei");
	
	// Updateall the elements print the min reverse order 
	 ListIterator<String>list2Itr=list2.listIterator();// [ Apple, Samsung, Huawei ]
	 
	 while ( list2Itr.hasNext()) {
		 list2Itr.next();
		 
	 }
	 
	 //To move the pointer to the end, use "hasNext" and "next()" 
	 while (list2Itr.hasPrevious()) {
		String element = list2Itr.previous();
		
		// System.out.println(element+"?");
	 }
	 Collections.reverse(list2);
	 System.out.println(list2);
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
