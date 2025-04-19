package HashSet_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSety_01 {

	public static void main(String[] args) {
		 Set se = new LinkedHashSet();
		 se.add("Mohan");
		 se.add("Monika");
		 se.add("Sonika");
		 se.add("Monika");
		 se.add("Monika");
		 se.add("Mohan");
		 se.add("Monika");
		 se.add(" ");
		 se.add(" ");
		 System.out.println(se);
		System.out.println( se.size());

	}

}
