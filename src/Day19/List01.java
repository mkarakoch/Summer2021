package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class List01 {

	public static void main(String[] args) {
		/*
		 arraylist is resizeble 
		 we can store nonprimitives 
		 we can not store multiple data types 
		 
		 */

		// create a arraylist 
		ArrayList<Integer>list1=new ArrayList<Integer>();
		
		List<Integer>list3=new ArrayList<Integer>();
		
		//add elements 
		list1.add(9);
		list1.add(1);
		list1.add(0);
		list1.add(2);
		list1.add(8);
		list1.add(3);
		list1.add(7);
		System.out.println(list1);
		list1.add(2, 4);
	System.out.println("after adding 8 into index 3rd:" + list1);


	// sort ArrayList
	
	Collections.sort(list1);
	System.out.println("after sorting : "+list1);
	
	
	// How to sort an arraylist in descending order 
	
	Collections.sort(list1,Collections.reverseOrder());
	System.out.println("sorting in descending order: " + list1);
	
	// printing a specific element
	
	System.out.println(list1.get(2));
	System.out.println(list1.get(5));
	
	//How to get number of elements inside an Arraylist 
	System.out.println("the number of elements :" +list1.size());
	
	/*
	Create listnum
    add the numbers 17,23, 11,17,3,5,8, -5,-3
    Please find and print the min and max elements in the list
	
	*/
	ArrayList<Integer>list2=new ArrayList<Integer>();
	
	list2.add(17);
	list2.add(23);
	list2.add(11);
	list2.add(17);
	list2.add(3);
	list2.add(5);
	list2.add(8);
	list2.add(-5);
	list2.add(-3);
	
	
	Collections.sort(list2);
	System.out.println("after sorting : "+list2);
	
	System.out.println("the min element is " + list2.get(0));
	System.out.println("the max element is "+list2.get(list2.size()-1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	} 	
		
	
}
