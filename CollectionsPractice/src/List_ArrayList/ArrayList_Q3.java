package List_ArrayList;

import java.util.ArrayList;

public class ArrayList_Q3 {
//3. Write a Java program to insert an element into the array list at the first position.
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		 ar.add("vishu");
		 ar.add("vikash");
		 ar.add("vimal");
		 ar.add("vishnu");
		 ar.add("virat");
		 ar.add("veer");
		 ar.add("veeru");
		 ar.add("vishwa");
		 ar.add("vishawajeet");
		 ar.add("vishwakarma");
		 ar.add("veera");
		 System.out.println(ar.size());
		 System.out.println(ar);
		 ar.add(0,"Mohan");
		 System.out.println(ar);
		 System.out.println(ar.size());
	}

}
