package Day20;

import java.util.ArrayList;
import java.util.List;

public class List07 {

	public static void main(String[] args) {
		
		/* 
		 Create a method to delete odd elements and multiply even elements by 3 from the list 
		 
		 */
		
		List<Integer> listnew = new ArrayList<>();
		listnew.add(4);
		listnew.add(6);
		listnew.add(10);
		listnew.add(15);
		listnew.add(12);
		multiplyby3(listnew);
		
		List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(8);
        list1.add(7);
		multiplyby3(list1);
		

	}

	private static void multiplyby3(List<Integer> list) {
		
		for (int i = 0; i<list.size(); i++) {
			if (list.get(i)%2!=0) {
				list.remove(i);
				i--;
			}else {
				list.set(i, list.get(i)*3);
				
			}
		}
		System.out.println((list));
	}

}
