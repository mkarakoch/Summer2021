package selfexercises;

public class ForLoop01EX {

	public static void main(String[] args) {
	
		
		
		for ( int i = 1 ; i<4 ; i++ ) {
			
			System.out.println("Hello");
		}
		//Print the even int from 15 to 29 on the console 
		
	
		for (int i = 16 ; i <= 29 ; i=i+2) {
			if (i%2==0) {
			System.out.print(i + " ");
			}
		}		
		
		
		System.out.println(" ");
		
		// Print the odd int from 120 to 65 on the console 
		
		
		for ( int i = 119 ; i>= 65 ; i--) {
			if (i%2!=0)
			
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		
		// Print the integers divisible by 4 and 6 from 13 to 130
		
		for ( int i = 13 ; i <=130 ; i++) {
			if (i%4==0 && i%6==0) {
				
				System.out.print(i + " ");
			}
		}
		
		System.out.println(" ");
		// Print the every character of a string by putting space between every consecutive character 
 		// EX: Suleyman ==> S u l e y m a n 
 		
		
		String name = "Muhammet";
		
		
		for (int i = 0 ; i < name.length() ; i++  ) {
			
			System.out.print(name.charAt(i) + " ");
			
		}
		
		String namey = " ";
		
		
		for (int y = 0 ; y < namey.length() ; y++  ) {
			
			System.out.print(namey.charAt(y) + "  ");
			
		}
		
		
		String name1 = "Emin";
		
		for ( int x =0; x<name1.length() ; x++) {
			
			System.out.print(name1.charAt(x) + " ");
		}
		
		for (int y = 0 ; y < namey.length() ; y++  ) {
			
			System.out.print(namey.charAt(y) + "  ");
			
		}
		String lname= "Karakoc";
		for(int z = 0 ; z<lname.length(); z++) {
			
			System.out.print(lname.charAt(z) + " ");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
