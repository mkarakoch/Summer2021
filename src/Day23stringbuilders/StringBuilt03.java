package Day23stringbuilders;

public class StringBuilt03 {

	public static void main(String[] args) {
	
		StringBuilder sb1 = new StringBuilder("I love Java");
		StringBuilder sb2 = new StringBuilder("I love Java");

		// how to handle this ?
		// how to converthem in to String
		System.out.println((sb1.toString().equals(sb2.toString())));
		
		//compare to 
		System.out.println(sb1.compareTo(sb2)); // 0 if they have same characters
												//-1 if they dont have same charachters
		
		
	
		
		
		
		;
		
	}

}
