package Day32collections;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		
		TreeSet<String>tset1 = new TreeSet<>();
		
			tset1.add("Tulip");
	        tset1.add("Rose");
	        tset1.add("Iris");
	        tset1.add("Lily");
	        tset1.add("Daisy");
	        System.out.println(tset1);
	        //java puts our elements in alphabetical order 
	        
	        
	        System.out.println("Lily");
	        System.out.println(tset1);
	        // if we try to add  same element it will override the first one 
	        
	        
	        System.out.println(tset1.ceiling("Rose"));
	        
	        System.out.println(tset1.ceiling("Loo"));//Rose
	        
	        System.out.println(tset1.ceiling("Tv"));
	        
	        // it will give the ewual or the greater we provide
	        
	        System.out.println(tset1.floor("Re"));
	    
	        System.out.println(tset1);
	        System.out.println(tset1.descendingSet());
	        // itwill put the elements in descending order
	        
	        System.out.println(tset1.headSet("Rose"));
	
	        System.out.println(tset1.headSet("Rose",true));
	
	
	        System.out.println(tset1.tailSet("Lily"));
	        // it will bring the elements starting from the element we provide to the end
	        
	        System.out.println(tset1.higher("Rose"));//Tulip 
	        // it will return the greater one 
	        
	        System.out.println(tset1.lower("Lily"));
	
	
	}

}
