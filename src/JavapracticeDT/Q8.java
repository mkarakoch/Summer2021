package JavapracticeDT;

import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		/* write a method that accepts an integer array as input and prints the minimum
        * and the maximum numbers from given array
        *
        *
        * Input : {3,2,5,4,1,6}
        * Output : min: 1 max : 6
        */
        int arr[] = {3,2,5,4,1,6};
        Arrays.sort(arr);
		System.out.println("Array after sort " + Arrays.toString(arr));

        System.out.println("Minimim element is " + arr[0]);
		System.out.println("Maximum Element is " +arr[arr.length-1]);
		
	}

}
