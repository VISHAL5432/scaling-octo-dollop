package List_ArrayList;
import java.util.ArrayList;
public class ArrayList_Q2 {
//2. Write a Java program to iterate through all elements in an array list.

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
		 System.out.println(ar);
		 for(Object s:ar) {
			 System.out.print(s+",");
			 
		 }
	}

}
