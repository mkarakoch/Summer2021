package Day23stringbuilders;

public class StringBuilers03 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		
		StringBuilder sb2 = new StringBuilder("Java");
		/*
		 equals() method in String Builder uses == to compare
		 
		 */
		// 1.st way Convert StringBuilder to String then use 
		
		
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		
		
		
		//2.way  
		
		
		System.out.println(sb1.compareTo(sb2));//0
		

	}

}
