package List_ArrayList;
import java.util.*;
public class Arraylist01 {

	public static void main(String[] args) {
		// Creating ArrayList of type String
		 List <String> list_Str = new ArrayList<String>();
		 // Adding / inserting elements inside array list
		 list_Str.add("Ram");
		 list_Str.add("Mohan");
		 list_Str.add("Sohan");
		 list_Str.add("Rohan");
		 list_Str.add("Ramu");
		 // print all the elements of array list
		 System.out.println(list_Str);
		 // Adding / inserting duplicate element inside ArrayList
		 list_Str.add("Ram");
		 // input null elements
		// list_Str.add(null);
		 list_Str.add(0,"Sanu");
		 
		 System.out.println(list_Str);
		 //Remove elements from Arraylist
		 list_Str.remove("Ram");
		 System.out.println(list_Str);
		 // Contains method 
//		list_Str.contains("Ramu");
//		System.out.println(list_Str);
		 System.out.println(list_Str.contains("Rohan"));
		 //traversing the ArrayList using for each loop
		 for(String elem :list_Str) {
			 System.out.print(elem+",");
		 }
		 list_Str.contains("Rohan");
	}

}
