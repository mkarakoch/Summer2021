package Day21ListsforeachLoop;

import java.util.ArrayList;
import java.util.List;



public class ForEachLoop01 {

	public static void main(String[] args) {
	
	
		List<Character>list1 = new ArrayList<>();
		
		list1.add('x');
		list1.add('z');
		list1.add('a');
		list1.add('m');
		
		System.out.println(list1);
		
		// Use for loop
		
		for (int i = 0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + "! ");//x! z! a! m! 
			
			// Use for -each
			
			for (Character w : list1) {
				System.out.print(w + "! ");
			}
			
			//if the characters are not vowel in list print them on the console
		for (Character w : list1) {
			if (w=='a' || w== 'e' || w== 'o' || w== 'i' || w== 'u' ) {
				continue;
				
				
			}
			System.out.print( w + "! ");// 
			
			System.out.println();
			System.out.println("******************");
		}
		// Print the ASCII values of all characters on the console 
		
		for (Character w :list1 ) {
			
			System.out.print(w + ":" + (int)w + "-");
		}
		System.out.println();
		System.out.println("********************");
		
				
		// Find the sum of ASCII values of the characters inside the list 
		
		int sum = 0;
		for (Character w :list1 ) {
			sum=sum+w;
			
		}
		
		System.out.print(" sum of ASCII is " + sum );
		break;
		}
		
		
		System.out.println();
		
		System.out.print("***************");
		System.out.println();
		// Print characters whose ASCII value are even 
		
		for (Character w : list1) {
			if ( w%2==0) {
				System.out.print(w+" ");
			}
		}
		System.out.println();
		System.out.println("*********");
		
		// if you see any character whose ASCII valuse is less then 100 stop printing
		
		Character less =' ';
		for (Character w : list1) {
			if ( w<100) {
				less = w;
				break;
			}
		
		}
		
		System.out.println(less + " has ASCII less than 100 ");
		System.out.println();
		System.out.println("***************");
		
		// Arrays can use for-each loop 
		// print the lsit elementswhicj does not end with "n"
		
		String s[] = {"Ali", "Can", "Hasan", "Ekrem"};
		for (String w : s) {
			if(!w.endsWith("n")) {
				System.out.print(w+ " ");
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
