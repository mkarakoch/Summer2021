package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		/* How to check if a specific element exist in an array or not 
			1-Use sort ()
			2-Then use binarySearch()
			
		*/
		char crr [] = { 'c' , 'A' , 'k' , 'm' };
		
		//check if 'x' exist in crr?
		Arrays.sort(crr);
		
		
		System.out.println(Arrays.binarySearch(crr,'x'));//-5, (-)meaning doesn't exist, (5) if exist the order of element 
		System.out.println(Arrays.binarySearch(crr,'e'));
		System.out.println(Arrays.binarySearch(crr,'Z'));
		System.out.println(Arrays.binarySearch(crr,'l'));
		
		
		

	}

}
