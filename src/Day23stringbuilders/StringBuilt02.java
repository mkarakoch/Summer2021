package Day23stringbuilders;

public class StringBuilt02 {

	public static void main(String[] args) {
		
		// Comparing
		StringBuilder sb1 = new StringBuilder("I love Java");
		StringBuilder sb2 = new StringBuilder("I love Java");

		System.out.println(sb1.equals(sb2));
		/* 
		 * in string builder equals() method works like "=" sign 
		 	it chechs the value of referances 
		 */
		
		System.out.println(sb1.equals(sb1));
		
		// to get to index of specific character
		System.out.println(sb1.indexOf("e"));
		System.out.println(sb1.indexOf("a"));
		System.out.println(sb1.indexOf("s"));
		
				
		//insert(offset, String)
		
		
		System.out.println(sb1.insert(7, "the "));
		
		//insert 
		System.out.println(sb1.insert(1,  "and , Asyalar" , 3, 10));
		System.out.println(sb1);
		
		//reverse
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		
		
		//replace
		
		sb1.replace(2,8,"*");
		
		System.out.println(sb1);
		
		
		sb1.replace(8, 13 , " ");
		System.out.println(sb1);
		
		
		//set char
		
		sb1.setCharAt(7, ' ');
		System.out.println(sb1);
		System.out.println("before trim " + sb1.capacity());
		
		
	
		sb1.trimToSize();
		System.out.println("after trim : " + sb1.capacity());
		
		
		
		
		
		
		
		
		
	}
	

}
