package Day31Iteratorscollections;

import java.util.HashSet;
import java.util.LinkedList;

import selfexercises.string;

public class Linkedlist01 {

	public static void main(String[] args) {

		/*
		 * it is very similar to the list but the structor is completely different we
		 * call the member of the linkedlist "Node" easch node has two parts 1 data 2
		 * pointer at the begining of the linkedlist of there us a "head " it does not
		 * hava a data part at tge end of the linkedlist the pointer pointss to the null
		 * 
		 */

		/*
		 * Assertion is quick and easy in linkedlist in assertion we judt break the
		 * pointer and link the new node but for list we need to update the indexes
		 * 
		 */

		/*
		 * reaching an element is easy with list. Because we can directly reach element
		 * by usinf index but it is to hard and takes time to raech a node in linkedlist
		 * 
		 * 
		 * Because it checks everynodes one by one.
		 */

		LinkedList<String> ll1 = new LinkedList<String>();

		ll1.add("Samet");
		ll1.add("Huseyin");
		ll1.add("Muhammet");

		System.out.println(ll1);

		ll1.add(1, "Osman");

		System.out.println(ll1);

		ll1.addFirst("Ali Can");
		System.out.println(ll1);

		ll1.addLast("Veli Han");
		System.out.println(ll1);

		System.out.println(ll1.contains("Ali Can"));// true
		System.out.println(ll1.contains("Bob"));// false

		System.out.println(ll1.element());

		LinkedList<String> ll2 = new LinkedList<String>();
		// System.out.println(ll2.element());
		// if our linkedlist is empty we need to handle it
		// otherwise it will throw an exception "NoSuchElementException"
		System.out.println(ll1);
		System.out.println(ll1.peek());

		// peek returns the first element
		// does not throw and exception

		System.out.println(ll1.poll());
		System.out.println(ll1);
		// poll () returns and remove the first element

		ll1.add("Osman");
		System.out.println(ll1);

		// ll1.removeFirstOccurrence("Osman");
		// removes the first osman
		// ll1.removeLastOccurrence("Osman");

		ll1.set(1, "Zeki");
		System.out.println(ll1);

		System.out.println(ll1.subList(2, 5));

		HashSet<String> hset1 = new HashSet<>();

		hset1.add("Blue");
		hset1.add("Orange");
		hset1.add("Turquoise");
		hset1.add("Pink");
		hset1.add("Green");
		hset1.add("Purple");

		System.out.println(hset1);

		hset1.add("Pink");
		System.out.println(hset1);
		/*
		 * 2- if you try to add an element twice, the second one will overwrite it.
		 * 
		 */
		hset1.add(null);
		System.out.println(hset1);
		hset1.add(null);
		System.out.println(hset1);
		/*
		 * 1- it will put the elemnts in natural order 2-ordering takes time so it works
		 * slower 3-elements are unique and in natural order alphabetical or from
		 * smallest to highest 4-it will overwrite the previous element when we try to
		 * put same one
		 */

	}

}
