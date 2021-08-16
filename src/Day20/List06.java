package Day20;

import java.util.ArrayList;
import java.util.List;

public class List06 {

	public static void main(String[] args) {	
			/* Create a method wich increase elements by two 
			 * 
			 */
		 List<Integer> list = new ArrayList<>();
	        list.add(3);
	        list.add(5);
	        list.add(7);
	        list.add(9);
	        list.add(11);
	        
	     increasedby2 (list);
	    
	}

	private static void increasedby2(List<Integer> list) {
	for (int i =0; i<list.size(); i++) {
		list.set(i, list.get(i)+2);
		
		
	}
		System.out.println(list);
	}

}
