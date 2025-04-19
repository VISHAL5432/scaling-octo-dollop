package MapInterface;

import java.util.HashMap;

public class HAshMap_01 {

	public static void main(String[] args) {
		 HashMap hm =new HashMap();
		 	hm.put("Monika","Roshan");
		 	hm.put( "Sonal","Ramu");
		 	hm.put(123, "Mohan");
		 	System.out.println(hm);
		 	hm.put('c', 'm');
		 	hm.put(123, "Mohan");
		 	hm.putIfAbsent("monika", "Roshan");
		// 	hm.compute("Monika" , "Roshan");
		 	
		 	System.out.println(hm);
		 	
		 	System.out.println(hm.get("Monika"));
	}

}
