package Day19;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		// How to update an element 
		
		ArrayList<String>liststr = new ArrayList<>();
		
		liststr.add("Ali");
		liststr.add("Bahar");
		liststr.add("Muhammet");
		liststr.add("Gamze");
		liststr.add("Umay");
		liststr.add("Kaan");
		liststr.add("Zeki");
		
		
		System.out.println(liststr);
		
		
		//Fo remove + add = set
		liststr.set(0,  "Selen");
		
		System.out.println("After setting a value : " + liststr);
		
//		liststr.set(liststr.indexOf("Bahar"),"Orhan");
//		System.out.println(liststr);
		
	}

}
