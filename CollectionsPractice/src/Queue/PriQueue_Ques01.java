package Queue;

import java.util.PriorityQueue;

public class PriQueue_Ques01 {
	// generic priority Queue
	public static void main(String[] args) {
		 PriorityQueue<String> que = new PriorityQueue<String>();
		 que.add("Red");
		 que.add("Green");
		 que.add("Orange");
		 que.add("White");
		 que.add("Black");
		 System.out.println("Elements of the priority Queue :");
		 System.out.println(que);
	
	}

}
