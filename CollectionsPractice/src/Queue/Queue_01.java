package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_01 {

	public static void main(String[] args) {
		 Queue q =new PriorityQueue();
		 q.add(7457);
		 q.add(345);
		 q.add(986);
		 q.add(1234);
		 q.add(986);
		// System.out.println(q);
		 while(!q.isEmpty()) {
			 System.out.println(q.remove());
		 }
		 q.add(234);
		 System.out.println(q.element());
	}

}
