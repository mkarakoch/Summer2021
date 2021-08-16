package day17arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		String eray [] = new String [5];
		eray[0]="Bahar";
		eray[1]="Halil";
		eray[2]="Nur";
		eray[3]="Selen";
		eray[4]="Zeki";
		/*
		System.out.println(Arrays.toString(eray));

		System.out.println(eray[0]);
		System.out.println(eray[1]);
		System.out.println(eray[2]);
		System.out.println(eray[3]);
		System.out.println(eray[4]);
		*/
		for (int i=0 ; i<eray.length; i++)
		{
		
		System.out.println(eray[i]);
		
		
		//we can also add elements directly into our array
		
		double a []= {12.1, 11.0, 13.5,11.2, 2.4, 4.1};
        
        double sum =0;
        
        for (int m =0; m< a.length; m++) {
            sum = sum+a[m];
        }
        
        System.out.println(sum);
		
		}
	}
}
