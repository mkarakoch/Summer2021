package Day29Exeptions_Abstruction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E02 {

	public static void main(String[] args) {
		// StringIndexOutOfBoundException
		 String s = "Javais Easy";
		 System.out.println(s.charAt(2));//v
	//	 System.out.println(s.charAt(12));//StringIndexOutOfBoundsException
	//	 System.out.println(s.charAt(-3));//StringIndexOutOfBoundsException

		 
		 //IlligalStateException 
		 //If you use a method in inappropriate time, you will get illigalStateException 
		 
		 List <Integer>list=new ArrayList<>();
		 list.add(21);
		 list.add(22);
		 list.add(23);
		 
		 Iterator<Integer> listItr= list.iterator();
	
		 listItr.next();
		 listItr.remove();
		 
		 
	}

}
