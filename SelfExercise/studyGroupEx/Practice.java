package studyGroupEx;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;
/*(Use iterators on ArrayList) Write a test program 
		 * that stores 10 million integers in ascending order (i.e., 1,2, . . ., 10m) 
		 * in an ArrayList, displays the execution time taken to traverse the list, 
		 * and searches for the 10 millionth element using the get(index) vs using the iterator method.
*/
public class Practice {

	public static void main(String[] args) throws OurOutOfBoundaryException {
		
		get((int)10E6-1);//352
		
	}
	 public static void get(int index) throws OurOutOfBoundaryException {
	        long start=System.currentTimeMillis();
	   //     List<Integer> list= store();
	        List<Integer> list= store2();
	        if(index>=0&&index<list.size()){
	            System.out.println(list.get(index));
	        }else{
	           throw new OurOutOfBoundaryException("index must be between 0 and "+list.size());
	        }
	        long stopWatch=System.currentTimeMillis()-start;
	        System.out.println(stopWatch);
	        
	        
	 
	    }
	 
	 public static List<Integer> store2() {
	List<Integer>list = new ArrayList<>();
	ListIterator<Integer> it=list.listIterator();
	int i=1;
	while (i<=10E6) {
		it.add(i);
		i++;
	}
	return list;
	
	
}


	  public static List<Integer> store(){
	      List<Integer> list=new ArrayList<>();
	      long start=System.currentTimeMillis();
	      for(int i=1;i<=10E6;i++){
	         list.add(i);
	      }

	return list;
	  }


}

	class OurOutOfBoundaryException extends Exception{
	    public OurOutOfBoundaryException(String message){
	        super(message);
	    }
	}