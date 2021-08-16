package Day19;

import java.util.ArrayList;
import java.util.List;



public class List04 {

	public static void main(String[] args) {
		/*
		 How to remove repeated elements from a list 
		 
		 */

			List<Character> list = new ArrayList<> ();
			list.add('a');
			list.add('b');
			list.add('a');
			list.add('c');
			list.add('a');
			list.add('b');
			list.add('t');
			
			System.out.println(list);//[a, b, a, c, a, b, t]
			
			
			List<Character> list2 = new ArrayList<> ();
			
			for (int i=0; i <list.size();i++) {
					
					if(!list2.contains(list.get(i)) ) {
					list2.add(list.get(i));	
					}
			}	
			System.out.println(list2);
	}

}
