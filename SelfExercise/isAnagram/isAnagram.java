package isAnagram;

import java.util.Arrays;

public class isAnagram {
	
	
	/*
	 * 
	 7. Write a method that checks to see 
     if the words u pass is Anagram. EX: read and dear  --> true
     
	 */
	
	static boolean isAnagram(String str1, String str2) {
		char [] arr1= str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		return Arrays.equals(arr1, arr2);
		
		
	}
	/*
	  12. Write a method that accepts an array and returns true 
	  if the sum of all 3's in the array is exactly 9. 
	  EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
	 */
	
	static boolean sumof3 (int [] a ) {
		int count = 0;
		
		for (int num : a) {
			if (num ==3) {
				count++;
			}
		}
		
		return count==3;
		
		
	}

	public static void main(String[] args) {
		

		System.out.println(isAnagram("read", "dear"));//true
		System.out.println(sumof3(new int [] {2,3,5,3,6,3,7}));//true
		
		
	}

}
