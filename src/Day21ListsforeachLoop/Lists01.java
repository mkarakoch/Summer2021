package Day21ListsforeachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Lists01 {

	public static void main(String[] args) {
	// How to convert an array ti a list 
		
		Character c[] = new Character [4];
		
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';
		System.out.println(Arrays.toString(c));
		
		
		List<Character> lc= new ArrayList<>();
		
		
		// how to convert an array to a list
		// 1. way: Use loops..
		for (int i=0; i<c.length; i++) {
			lc.add(c[i]);
		}
		System.out.println(lc);
		
		
		
		
		
		//2. Way
		String s[]= {"Ali", "Can","Veli"};
		List<String>l1c = Arrays.asList(s);
		
		System.out.println(l1c);
		
		
		List<String>l2c = Arrays.asList(s);
		System.out.println(l2c);
		
		
		Integer irr[] = {2,5,3,1};
		List<Integer>l3c=Arrays.asList(irr);
		System.out.println(l3c);
		
		
		/*
		  this is unsupported operation because this is a fake list, 
		  that means you cant add an element, it behaves as list but it actually is not.
		  
		  */
		 
//		l3c.add(7);
//		System.out.println(l3c);
		 
//		 l3c.remove(1);
//		 System.out.println(l3c);
//		 
//		 l3c.clear();
//		 System.out.println(l3c);
		 
		 System.out.println(l3c.contains(3));
		 
		 l3c.set(1, 15);
		 System.out.println(l3c);
		 
		 
		 
		 
		 // How to convert a list to an Array
		 
		 List<Integer> list = new ArrayList<>();
		 
		 list.add(12);
		 list.add(15);
		 list.add(11);
		 list.add(8);
		 
		System.out.println(list); //[12,15,11,8]
		
		// in the code "new Integer[0]", data type depends on the list elements. 
		// In the example, data type of the list elements is Integer because of that I used Integer.
		
		Integer arr[]= list.toArray(new Integer [0]);
		System.out.println(Arrays.toString(arr));
		
				 
				
		 
		 
		 
		 

		 
		 
		 
		 
		
	}

}
