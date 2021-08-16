package selfexercises;

public class ForloopEx {

	public static void main(String[] args) {
		
			for (int i = 1; i<=10 ; i++) {
	
			System.out.println("Hello World");
			
			}
			System.out.println(" ");
			// print int from 13 to 15 on the console in the same line with a space betw them 
	
	
			for (int i=13 ; i<=15  ;  i++) { 
				
				System.out.print(i + " ");
			
			}
		System.out.println("");

			for (int i=18 ; i>= 14 ; i--)
			{
				
				System.out.print(i+" ");
				
			}
			
			System.out.println("");
			//Print the even int from 15 to 29 on the console 
			// 15 ten 29 a cift sayilari siralayacaz 
			
			
			
			for (int i=15 ; i<=29 ; i++ ) {
				
				if ( i%2==0) {
					
					System.out.print(i + " ");
					}
				
			
			}
			
			
			System.out.println();
			
			// 2. way 
			
			for ( int i = 16 ; i<=33 ; i=i+2) {
				
				System.out.print(i + " ");
			}
			
			System.out.println();
			
			// print the odd from 40 to 15
			
			
			for (int i = 35 ; i >= 15 ; i--) {
				
				if (i%2!=0) {
					System.out.print(i+" ");
					
				}
			}
			
			System.out.println();
			
			//print the integers divisible by 4 and 6 from 13 to 130
			
			for (int i = 1; i <=110 ; i++) {
				
				if (i%4==0 && i%6==0) {
					System.out.print(i+" ");
					
				}
			}
			
			System.out.println();
			// 2. way 
			
						for ( int i = 12 ; i<109 ; i+=12) { // 24 un, 13 ten sonra 12 ye bolunebilen ilk sayi oldugunu ve sayilarin 12 ser 12 ser artigini biliyor olman lazi.
							
							System.out.print(i + " ");
							
						}
						
			
			System.out.println();
			
			// print very character of a String by putting space between every consecutive character 
			//Ex Mamicillo
			
			
			String name = "Mamicillo";
			
			for (int i = 0; i<name.length();   i++) {
				System.out.print(name.charAt(i)+ " ");
				
			}
					
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			}

}
