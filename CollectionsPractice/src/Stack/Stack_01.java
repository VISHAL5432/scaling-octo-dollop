package Stack;

import java.util.Stack;

public class Stack_01 {

	public static void main(String[] args) {
		 Stack s = new Stack();
		 s.push("Truits");
		 s.push("Vegetables");
		 s.push("Leaves");
		 s.push( "Shrubs");
		 System.out.println(s);
		 s.pop();
		 s.pop();
		 System.out.println(s);
		 s.push(456);
		 s.push('v');
		 System.out.println(s);
		 System.out.println(s.size());
		 System.out.println(s.peek());
		 System.out.println(s.contains('v'));
	}
	

}
