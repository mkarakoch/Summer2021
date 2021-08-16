package day18arraysmultidimensionalarrays;



public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
	/*
	 arr1 = { {1,2},{3,4,5},{6}} and  arr2 = {{7,8,9},{10,11},{12} }
	 Find the sum of elements whose indexes are same in ar1 and arr2
	 
	 (1+7)+(2+8)+(3+10)+(4+11)(6+12)=64
	 */
		
		
		int arr[][]={ {1,2}, {3,4,5}, {6} };
		int brr[][]={ {7,8,9}, {10,11}, {12} };
		
		int outerLen=arr.length<brr.length ? arr.length:brr.length;
		
		int sum=0;
		
		for (int i=0 ; i<outerLen;i++) {
			int innerLen=arr[i].length<brr[i].length ? arr[i].length:brr[i].length;
			
			for(int j=0; j<innerLen; j++) {
				sum=sum+arr[i][j]+brr[i][j];
				System.out.println("sum=arr[" + i+ "]["+ j+ " ]"+ " brr[" + i + "][" + j+ "]");
				System.out.println("innerlen= " + innerLen );
				System.out.println("outLen=" + outerLen); 
				System.out.println("************");
				
			}
		}
		System.out.println(sum);
		
	}
}