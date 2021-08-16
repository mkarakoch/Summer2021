package Day31Iteratorscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

	public static void main(String[] args) {


		List<String>list1 = new ArrayList<>();
		list1.add("Osman");
		list1.add("Sadik");
		list1.add("Zeki");
		
		
		System.out.println(list1);
		
		//we can not update collections by using for loop or for eachloop
		
		
		for(String w:list1) {
			w=w+"#";
			
		}
		// As you see it didnt update the list 
		
		System.out.println(list1);
		
		/* When we want to update our list we can use listIterator or Iterators
		 Iterator Updates lists
		 They are so similar actually the work flow is same 
		 But listIterator has more methods
		*/
	
	
		ListIterator<String>list1Itr =list1.listIterator();
		
		while (list1Itr.hasNext()) {
			String element = list1Itr.next();
			list1Itr.set(element+"#");
		}
		
		System.out.println(list1);
	
	//update all elements and print in reverse order 
		
		List<String>list2 = new ArrayList<>();
		list2.add("Java");
		list2.add("Python");
		list2.add("Html");
	
		
		ListIterator<String>list2Itr =list2.listIterator();
		while( list2Itr.hasNext()) {
			list2Itr.next();
		}
	
		while (list2Itr.hasPrevious()) {
			String element = list2Itr.previous();
			//System.out.print(element+"@  ");
			list2Itr.set(element+"@ ");
		}
	
		Collections.reverse(list2);
		System.out.println(list2);
	
	//removing elements by using listiterator
		
		List<String>list3 = new ArrayList<>();
		list3.add("A");
		list3.add("L");
		list3.add("S");
		System.out.println(list3);
	
	ListIterator<String>list3Itr = list3.listIterator();
	while(list3Itr.hasNext()) {
		list3Itr.next();
		list3Itr.remove();
	}
	System.out.println(list3);
	
	// Add element
	List<String>list4 = new ArrayList<>();
	list4.add("Taner");
	list4.add("Zeki");
	list4.add("Alper");
	System.out.println(list4);
	
	ListIterator<String>list4Itr = list4.listIterator();
	
	list4Itr.add("Selen");
	System.out.println(list4);
	
	
	
	//  We add elements below to the end whith whileloop
	while(list4Itr.hasNext()) {
		list4Itr.next();
		
	}
	list4Itr.add("Huseyin");
	list4Itr.add("Muhammet");
	list4Itr.add("Gokcen");
	
	System.out.println(list4);
	
	List<String>list5 = new ArrayList<>();
	list5.add("Cup");
	list5.add("desk");
	list5.add("paper");
	System.out.println(list5);
	
	Iterator<String>list5Itr = list5.iterator();
	
	/*
	  	iteratos doenst have has.Previous() and previous 
	  	ListIterator can work in 2 ways
         * but iterator can work only one way
         * we can use listIterator with list
         * we can use Iterator with list, set , map  (with collections)
	 */
	
	while(list5Itr.hasNext())  {
		list5Itr.next();
		//list5Itr.set() iterators doesnt support hav set 

		
	}
	
	//list5.add() doesnt support
	
	//list5Itr.remove();  supports
	
	
	
	
	
	
	
	
	
	}

}
