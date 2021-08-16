package selfexercises;

import java.util.Scanner;

public class StringManipulationsEX {

	public static void main(String[] args) {
		// 6. methoda ornek contains() bir kontanirin icinde aranan kelimenin olup olmadigina bakiyor. 
		Scanner scan = new Scanner (System.in);
		
		String s1 = "";
		String s2 = " ";
		String s5 = "learn Java earn money...";
		String s6 = "java";
		System.out.println(s5.contains(s6));	//false <== Because of the cases it returned false
		System.out.println(s5.contains(s2));	//true s2 deki bosluk s5 icindede var bu yuzden true olarak donutor 
		System.out.println(s5.contains(s1));	//true
		//System.out.println(s5.contains(null));	//NullPointerException
					
					System.out.println(s5.contains(s6));	//false <== Because of the cases it returned false
					System.out.println(s5.contains(s2));	//true s2 deki bosluk s5 icindede var bu yuzden true olarak donutor 
					System.out.println(s5.contains(s1));	//true
					//System.out.println(s5.contains(null));	//NullPointerException
					
					scan.close();

	}

}
