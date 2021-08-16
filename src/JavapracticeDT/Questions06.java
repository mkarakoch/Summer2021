package JavapracticeDT;

public class Questions06 {

	public static void main(String[] args) {
	/*	* write a java program that calculates the average value of array elements
        *
        * input[]= {1,2,3,4,5,6,7}
        * Output : 4
*/
		
		int sum = 0;
		double ave=0;
		
		int [] input ={1,2,3,4,5,6,7};
		
		for (int i=0; i<input.length ; i++) {
			sum = sum + input [i];
			
		}
		
		ave=sum/(input.length);
		System.out.println(ave);
	}

}
