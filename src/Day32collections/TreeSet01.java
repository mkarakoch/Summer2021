package Day32collections;

import java.util.TreeSet;

public class TreeSet01 {
	
	/*
	  
			1- All elements are unique and in ascending order
			

	 */

	public static void main(String[] args) {
		
		TreeSet<String> ts1 = new TreeSet<>();
		
		ts1.add("Apple");
		ts1.add("Mango");
		ts1.add("Orange");
		ts1.add("Palm");
		ts1.add("Apricot");
		ts1.add("Palm");

		
		//Returns the least element in this set greater than or equal to the given element, or null if 
		//there is no such element.
		
		System.out.println(ts1.ceiling("Osa"));
		
		//Returns the greatest element in this set less than or equal to the given element, 
		//or null if there is no such element.
		System.out.println(ts1.floor("Anna"));//Null
		
		System.out.println(ts1.descendingSet());// [Palm, Orange, Mango, Apricot, Apple]
		System.out.println(ts1.first());//apple  returns the first 
		System.out.println("************");
		System.out.println(ts1.headSet("Mango"));//[Apple, Apricot]==> print you all elements from the first till the elemenet you put.
		System.out.println(ts1.headSet("Mango",true));//[Apple, Apricot, Mango] includes the element you put
		System.out.println(ts1.tailSet("Mango")); //[Mango, Orange, Palm]
		System.out.println("***************");
		System.out.println(ts1.higher("Mango"));// Element after mango, Orange
		System.out.println(ts1.lower("Mango"));//Elements before mango, Appricot
		
		System.out.println(ts1);
		
		
		String name = "Fruit";
		System.out.println(name);
		
	

	}

}
