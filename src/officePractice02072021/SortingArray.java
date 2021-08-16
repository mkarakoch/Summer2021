package officePractice02072021;
import java.util.Arrays;
public class SortingArray {

	public static void main(String[] args) {
		/* Sorting numeric or String array 
         * myString= { "Java", "C#", "Pyhton"}
         * myNums= { 89, 235 , 199 , 146, 201
                , 1458, 258, 125, 147}
         */
			
		int[] mynums = { 89, 235 , 199 , 146, 201, 1458, 258, 125, 147};
		
		System.out.println("Before sorting " + Arrays.toString(mynums));
		Arrays.sort(mynums);
		
		System.out.println("After sorting =" + Arrays.toString(mynums));
		
        String[]str={ "Java", "C#", "Pyhton"};
        System.out.println("Before sorting= "+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("After sorting= "+Arrays.toString(str));

		
    	
        
        
	}

}
