package Day19;

import java.util.ArrayList;

public class Lists04 {

	public static void main(String[] args) {
		/*
		- Please create an Integer ArrayList 
		- Add numbers  : 3,45,12,3,6,45,7,8
		-remove the repeated elements from your list
		-print the new list 
		
		
		 */
		ArrayList<Integer>list1=new ArrayList<>();
		
		list1.add(3);
		list1.add(45);
		list1.add(12);
		list1.add(3);
		list1.add(6);
		list1.add(45);
		list1.add(7);
		list1.add(8);
		
		
		System.out.println("before change duplicated elements" + list1);
		ArrayList<Integer>list2=new ArrayList<>();
		
		for ( int i = 0 ; i<list1.size(); i++) {
			
			if ( !list2.contains(list1.get(i))) {
			list2.add(list1.get(i));
			}else {
				continue;
			}
			
		}
	
		System.out.println("after change duplicated elements" + list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
