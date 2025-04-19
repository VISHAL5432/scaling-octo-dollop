package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TestDeque {

	public static void main(String[] args) {
		/* we can store diff values according our need.
		   we can also add values from both end of Deque.
		    it adds value from last by  default, when we use Common add method.
		    it can also stores multiple  null values.
		    it also store duplicate values. 
		    we can also add different types of data in Deque.
		*/
		 Deque  de = new ArrayDeque();
		 de.add("Mozito");
		 de.addFirst("Monika");
		 de.addLast("Sonali");
		 de.add("Sohan");
		 de.addFirst("Sonam");
		// de.add(" ");
		 de.addFirst("Shalu");
		 de.addLast("Sonali");
		// de.add(" ");
//		 de.add(234);
//		 de.addFirst('w');
//		 de.addLast(2341);
		 System.out.println(de);
		 // Reverse order iterator
		 Iterator reverse = de.descendingIterator();
		 System.out.println("Reverse Iterator"+de);
		 while(reverse.hasNext()) {
			 System.out.println("\t"+reverse.next());
		 }

	}

}
