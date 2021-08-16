package day24_multiThreadSyncenCapsulation;

import java.util.Arrays;

public class Vararg01 {
	
	
	/*
	 1-Java uses arrays with Varargs. Varargs behaves like arrays with some differences
	 2- You cant use more than 1 varargs 
	 3- Varargs must be last paramater
	 "... can be put just beofre varargs name(int...a) or after data type 
	
		Notice: If you need ame method to use with different number o fparamaters, use varargs
	 
	 */


	public static void main(String[] args) {
	
		System.out.println(add());
		//System.out.println(Arrays.toString(add(5,7))); you can use this way if you create arrays and if you change return type and use formula inside delete Arrays.to String 
		
		System.out.println(add(5,7));
		System.out.println(add(5,6,7,8));
		
		
	}
	
	public static int add () {
		return 3+5;
		
	}
	public static int add (int a, int b) {
		return a+b; 
		
	}
	public static int add (int a, int b, int c) {
		return a+b+c; 
	}
		// instead of vreating method to add veriable we can reates varargs
	
	
	
	public static int add (int ... a) {
		int sum = 0;
		for (int w : a) {
			sum = sum+w;
			
		}
		return sum; 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}