package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExQues {

	public static void main(String[] args) {
		/*
			*	1)Create a String list whose elements are A, C, E, and F. Print it on 
				the console.
				
			*	2)By using add() with index method, add B into the 1st index.
				List elements (( by using collections.sort() ))  should be like A, B, C, E, and F. Print it on the console
				
			*	3)By using set() method, convert E to D.
				List elements should be like A, B, C, D, and F. Print it on the console
				
			*	4)By using remove() method, remove F from the list.
				List elements should be like A, B, C, D. Print it on the console
				
				5) By using reverseOrder() sort it to descending order
				
				
				6)Find the size of the list and print the size on the console.
		 */
				ArrayList<Character>list1=new ArrayList<>();
				
				list1.add('A');
				list1.add('C');
				list1.add('E');
				list1.add('F');
				
				System.out.println("1- List1 is                 :" + list1);
				
				
				
				list1.add('B');
				System.out.println("2- After added B            :" + list1);
				
				list1.set(2, 'D');
				System.out.println("3- After converting E to D  :" + list1);
				
				list1.remove(3);
				System.out.println("4- After remove F           :" + list1); 
				
				Collections.sort(list1);
				System.out.println("   After sorting elements   :" + list1);
				
				Collections.sort(list1, Collections.reverseOrder());
				System.out.println("   After descending order   :" + list1);
				
				System.out.println(list1.size());
				
				System.out.println(list1.get(0));
				
				System.out.println(list1.get(list1.size()-1));
				
		
	}

}
