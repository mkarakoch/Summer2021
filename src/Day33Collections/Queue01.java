package Day33Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/* 
	   1 Queue focuses on First Element because Q is used in Firsr in first out operation. 
	   2 when u use Q as data typr you will have many methods related with element
	   3 If you use LinkedList constructor to create Queue, the elements will be in insertion order.
          If you use PriorityQueue constructor to create Queue, the elements will be in order according to the Java ordering rule
          but if you want, you can declare a rule to sort the elements. We will learn how to declare sorting rules in Lambda Course
     */
	 

	public static void main(String[] args) {
		
		Queue<String>q1 = new LinkedList<>();
		
		q1.add("Rick");
		q1.add("Maggie");
		q1.add("Glenn");
		q1.add("Megan");
		q1.add("Daryl");
		
		//q1.element();//Retrieves, but does not remove , the head of this queue.
					///@throwsNoSuchelement Exception if this queue is emty 
		//q1.peek(); // Retrieves but does not remove, the heasd of this queue 
					//Returns null it this queue is empty
		
		//q1.poll();/*Retrieves, but does not remove, the head of this queue.
		 		//	throws an exception if this queue is empty
		 			
		//q1.remove(); /*Retrieves and removes the head of this queue,
	      			//Throws throws NoSuchelement Exception if this queue is empty.
		
		q1.offer("XXXX"); // Insert the specfied elements into queeu
		
		q1.add("YYYY"); // Inserts the specified elmenets into this queu
		
		
		
		
		System.out.println(q1);
		
		Queue<String> q2 = new PriorityQueue<>();
		
		q2.add("M");
		q2.add("United States");
		q2.add("AB");
		q2.add("Gerany");
		q2.add("X");
		q2.add("12345");
		System.out.println(q2);
				
		
	}

}
