package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		String s1[] = { "Ali", "Can", " Veli"};
		String s2[] = { "Can", "Veli", "Ali"};
		String s3[] = { "Ali", "Can", " Veli"};
		
		System.out.println((Arrays.equals(s1, s2)));
		System.out.println((Arrays.equals(s1, s3)));
		
		
		// how to check 2 arrays have same elements ignore indexes
		
		// s1 and s2
		
		Arrays.sort(s2);
		if (Arrays.equals(s1,s2)) {
			System.out.println("Have same elements");
			
		}else {
			System.out.println("Does not have same elements");
			
		}
		
		/* 
		  slip() method is from String Class
		  
		 */
		
		
		String s4 = "Ali Can went to school";
		s4.split(" ");
		String words [] = s4.split(" ");
		System.out.println(Arrays.toString(words));
		String parts[] = s4.split("o");
		System.out.println(Arrays.toString(parts));
		
		
		String chars[] = s4.split("");
		
		System.out.println(Arrays.toString(chars));
		System.out.println(chars.length);
		
		
		String charexceptSpace[] = s4.replace(" ", "").split("");
		System.out.println(Arrays.toString(charexceptSpace));
		System.out.println(charexceptSpace.length);

		
		
		
		// How many 'a' wa used in the String "Mama may I go to Alabama"
		String s5 = "Mama may I go to Alabama";
		String arr[] = s5.split("a");
		/*
		  To check the number of "a" s in the String we have 3 different scenerios
		  - "a" is not at the begining and at the end 
		  - "a" is at the begining and at the end 
		  -  " a" used just once at the begining or at the end 
		 */
		
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr.length-1);
		
		if (s5.startsWith("a") && s5.endsWith("a")) {
			System.out.println(arr.length);
			
			
		}else {
			System.out.println(arr.length);
		}
		
		
		// 2. way number of all characters - number of all 'a' s = result
		
		String a1[] = s5.split("");
		String a2[] = s5.replace("a" , "").split("");
		System.out.println("Second way " + (a1.length-a2.length));
			
		
		//3.rd way use loops 
		int count = 0;
		for (int i=0 ; i<s5.length(); i++) {
			if (s5.charAt(i) == 'a') {
				count++;
				
			}
		
		}
		System.out.println("Third way" + count);
		
		
		
		//4.Way: Use regex to remove all characters except "a"
				System.out.println("Fourth way: " + s5.replaceAll("[^a]", "").length());
		
		
		
		
		
		
		
		
		
	}

}
