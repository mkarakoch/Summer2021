package Day20;

import java.util.ArrayList;
import java.util.List;

public class List08 {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(23);
        list1.add(12);
        list1.add(11);
        list1.add(13);
        list1.add(10);
        
        //adding list2 into list1 
        List<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(2);
        list2.add(17);
        list2.add(18);
        list2.add(1);
        list2.add(115);
        //adding epty list to list1
        List<Integer> list3 = new ArrayList<>();
        
		System.out.println(list1.addAll(list2));
		System.out.println(list1);
		System.out.println( list1.addAll(list3));
		
		//list4 to a specific index
		List<Integer> list4 = new ArrayList<>();
		
		list4.add(12);
		list4.add(121); 
		list4.add(125);
		
		list1.addAll(2, list4);
		System.out.println(list1);

		// to delete all the elements from the list 
		list1.clear();
		System.out.println(list1);
		
		
		//HW
		/* List<String> str  = new ArrayList<>();
       str.add("aa");
       str.add("bab");
       str.add("ab");
       str.add("ac");
       
	   please write a method which adds * to th eall elements
	   Given a list of integers, return a list where each integer is multiplied with itself.
	   please create a method which multiplies all the elements by itself and then call it from the main method
       */
		
		//
	}

}
