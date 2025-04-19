package List_ArrayList;
 
import java.util.*;
 
//5. Write a Java program to update an array element by the given element.
public class ArrayList_Q5 {

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
		ar.set(2,"Daku");
		
		 System.out.println(ar);
		 System.out.println(ar.size());
		//ar.add(2,"Daku");
		 System.out.println(ar);
	//	 6. Write a Java program to remove the third element from an array list.
		 ar.remove(2);
		 System.out.println(ar);
		 //7. Write a Java program to search for an element in an array list.
		System.out.println(ar.contains("vishu")+" "+ ar.indexOf("vishnu"));
	//	8. Write a Java program to sort a given array list.
		 ar.sort(null);
		 System.out.println(ar);
	//	 9. Write a Java program to copy one array list into another.
		 ArrayList ar1 = new ArrayList();
		// Collections.copy(ar1,ar);
		 System.out.println(ar1);
	}

}
