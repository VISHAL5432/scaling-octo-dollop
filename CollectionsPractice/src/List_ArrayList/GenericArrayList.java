package List_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class GenericArrayList {

	public static void main(String[] args) {
		// Generic ArrayList-> Adding different types of Dtata type s inside it.
		 ArrayList al = new ArrayList();
		 al.add("Vishu");
		 al.add("Ram Chandra");
		 al.add("Mohan Das");
		 al.add(2345);
		 al.add(2345.345);
		 al.add("Chote Lal");
		 al.add('v');
		 System.out.println(al);
		 al.add("Sanju Baba");
		 System.out.println(al);
		 //remove element / object from ArrayList
		 al.remove("Sanju Baba");
		 System.out.println(al);
		 // Size of ArrayList
		 System.out.println(al.size());
		 // to check ArrayList is empty or not. it returns boolean value.
		 System.out.println(al.isEmpty());
		 // to find index number of an element/object of an ArrayList.
		 System.out.println(al.indexOf('v'));
		 
		 //Adding new element in ArrayList
		 al.add("Vishu");
		 al.add("Vishnu");
		 al.add("Vishal");
		 al.add("Vishwa");
		 System.out.println(al);
		 // Add element at Specific location / Specific index number
		 al.add(6,"Vishwajeet");
		 System.out.println(al);
		 System.out.println(al.size());
		 // get object or element from specific position
		 System.out.println(al.get(2));
		 System.out.println("----------------------------------------");
		 // By creating object of object class in Arraylist
		 Object ob = al.get(3);
		 System.out.println(ob);
		 System.out.println("---------------------------------------");
		 
		 for(int i = 0; i< al.size(); i++) {
			 Object os = al.get(i);
//			 System.out.print(os+",");
//			 System.out.println();
			
			 /*
			  * // Type Casting the objects of Array list : 
			 // it casts only String type not the whole data type
			
			 String s = (String)os;
			 System.out.print(s+",");
			 */
			 // it casts the whole dATA TYPES IN  String type objects.
			 String ss = os.toString();
			 System.out.print(ss+",");
			 
		 }
		 System.out.println("------------------------------------");
		 
		 //System.out.println(ss.size());
		 //Creating new ArrayList in Same Class
		 ArrayList as2 = new ArrayList();
		 as2.add("Vishu");
		 as2.add("Vish");
		 as2.add("Mona");
		 as2.add("Mottu");
		 as2.add("Moti Lal");
		 System.out.println("As2 Print --> "+as2);
		 
		 //Adding two ArrayList in a single Arraylist
		 al.addAll(as2);
		 System.out.println(al);
		 System.out.println(al.size());
//		 iterate Arraylist Using for each loop using Object class//
		 
		 for(Object x:al) {
			 System.out.println(x);
		 }
		 as2.add("AC");
		 as2.add("Cooler");
		 as2.add("Fridge");
		 as2.add("Almeera");
		// al.removeAll(as2);
		 
		 System.out.println(al);
		 System.out.println(as2);
		 System.out.println("--------------------------------------");
		 al.retainAll(as2);
		 System.out.println(al);
		 
		 System.out.println("---------------------------------------");
		 
		 Iterator it = al.iterator();
		 while (it.hasNext()) {
			 Object oi = it.next();
			 if(oi.equals("vishu"))it.remove();
			 System.out.println(oi);
		 }
		 System.out.println(al);
	}	

}
