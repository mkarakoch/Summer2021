package tech_pro;

import java.util.Arrays;



public class Q01 {
	/*
	  12. Write a method that accepts an array and returns true 
	  if the sum of all 3's in the array is exactly 9. 
	  EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
	 */
	
	static boolean sumofThree (int [] a) {
		int count = 0;
		for ( int num : a) {
			
			if( num ==3) {
				
				count++;
			}
		
			
		}	return count==3;
		
	}
	
	/*
	     7. Write a method that checks to see 
	     if the words u pass is Anagram. EX: read and dear  --> true
	 */

	static boolean isAnagram(String str1, String str2){
        //toCharArray
        //split()
        //String[] arr1 = str1.split("");
        char[] arr1 = str1.toCharArray();
        //String[] arr2 = str2.split("");
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

	//  9. Write a method that accepts an Array of integers and returns the max and 10. 
	//Write a method that accepts an Array of integers and returns the second max.

	public static void main(String[] args) {
		System.out.println(sumofThree(new int [] {2,3,5,3,6,3,7}));
		System.out.println(isAnagram("elbow","123"));

	}

}
