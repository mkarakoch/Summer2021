package JavapracticeDT;

public class Question07 {

	public static void main(String[] args) {
	/*	Write a method that sums even numbers in the entered Multidimensional array
        INPUT : {{1,3,6},{2,8},{5,7,9,14}}
 *
 * OUTPUT :sum of even numbers in array : 30
 */
 int [][] arr= {{1,3,6},{2,8},{5,7,9,14}};
 int sum =0;
 for (int i = 0; i<arr.length; i++) { // bu 3 kume icin 
	 	
	 for( int j =0; j<arr[i].length; j++)// bu kumelerin icindeki sayilar icin 
	 	
	 	
	 if (arr[i][j]%2==0) {
		 sum=sum + arr[i][j];
		 
	 }
 }
 
 
 System.out.println(sum);
 
	}

}
