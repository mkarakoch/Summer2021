package day30exceptionsinterfacesiteratorscollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<>();
		list1.add("ali");
		list1.add("Can");
		list1.add("Aliye");
		list1.add("Canan");
		
		System.out.println(list1);// [ali, Can, Aliye, Canan]
		
		
		for (String w : list1) {
			
			w=w+"!";
			
		}
		// by usinf for loop we are not able to change the collection elements 
		System.out.println(list1);//[ali, Can, Aliye, Canan]
		
		
		
									// Iterator
		
		ListIterator<String>listitr =  list1.listIterator();//[ ali,  Can,  Aliye,  Canan]
		
	while (listitr.hasNext()) {
		String element = listitr.next();
		System.out.println(element);
		
	}
		
		
		
		
		
		
	}

}
