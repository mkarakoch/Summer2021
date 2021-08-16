package ForEachLoop;


import java.util.ArrayList;
import java.util.List;

import Day19.List01;







public class ForEach_Loop {

	public static void main(String[] args) {
		
		
		List <Character>list1 = new ArrayList<>();
		
		list1.add('x');
		list1.add('z');
		list1.add('a');
		list1.add('m');
		
		System.out.println(list1);
		
		
		for ( Character w : list1) {
			
			System.out.print(w+ "!" + " ");
			
		}
		
		System.out.println();
		System.out.println("******************");
		
		for (Character w: list1 ) {
			if (w =='a' || w =='e'|| w =='i'|| w =='o'||w =='u') {
				
				continue;
				
				
			}System.out.print(w+" ");
		}
		
		System.out.println();
		System.out.println("*********");
		
	// // Find the sum of ASCII values of the characters inside the list 
		
		int sum = 0;
		
		for (Character w : list1) {
			sum = sum+w;
		
		}
		System.out.println("Sum of ASCII is " + sum);
		//break;
		System.out.println();
		System.out.println("************");
		
		// // Print characters whose ASCII value are even 
		
		for (Character w: list1) {
		
		if( w % 2==0) {
			
			}System.out.print(w +"!"+ " ");
		
		}
		
		System.out.println();
		System.out.println("******************");
		
		// if you see any character whose ASCII valuse is less then 100 stop printing
	
		
			Character less = ' ';// ??????
			for (Character w : list1 ) {
				if (w<100) {
					less=w;// ?????
					break;
					
				}
			}System.out.print(less + " has ASCII less that 100");
			
			
			
	
	
	
	
	
	
	
		
	
	}

}
