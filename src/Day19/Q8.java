package Day19;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		/*
		* ask to user how many cups of tea you drink daily and how many spoons of sugar
        * one spoon sugar is 1.7 gr
        * print on the console amount of sugar used annually
        *
*/
		Scanner scan = new Scanner (System.in);
		System.out.println("how many cups of tea you drink daily"); 
		int tea = scan.nextInt();
		System.out.println("how many spoon of suger do you consume for a tea");
		int sugar = scan.nextInt();
		
		System.out.println((tea*sugar*360*1.7/1000) + "kg sugar annually");
		
	}

}
