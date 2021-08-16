package Day29Exceptions_Abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E02 {

	public static void main(String[] args) {


//		String str = "Larning Java is so fun";
//		System.out.println(str.charAt(5));
//		
//		System.out.println(str.charAt(27));

		
		
		//IlligalStateException
		
		// when we try to use method at an inappropriate(wronh) time 
		
		
		
		List<Integer>list = new ArrayList<>();
		
		list.add(12);
		list.add(23);
		list.add(45);
		
		
		
		Iterator<Integer>litr = list.iterator();
		litr.next();
		litr.remove();

	}

}
