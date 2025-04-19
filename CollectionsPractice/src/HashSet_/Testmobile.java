package HashSet_;

import java.util.ArrayList;

public class Testmobile {
public static void main(String[] args) {
	Mobile m1 =new Mobile("Red Mi",1234543,"Note 9",9750,"r123");
	Mobile m2 =new Mobile("Real Mi",1234563,"Note tc",8950,"r143");
	Mobile m3 =new Mobile("Red Mi",1234547,"Note 9",9950,"r126");
	Mobile m4 =new Mobile("Red Mi",1234545,"Note 9",8750,"r128");
	Mobile m5 =new Mobile("Red Mi",1234544,"Note 9",10750,"r156");
	Mobile m6 =new Mobile("Red Mi",1234543,"Note 9",9750,"r123");
	ArrayList <Mobile> al = new ArrayList();
	al.add( m1);
	al.add( m2);
	al.add(m3);
	al.add(m4);
	al.add(m5);
	al.add(m6);
	for(Mobile mm:al) {
		System.out.println(mm);
	}
	
	
	System.out.println("------------------------------------------------");
	
	
	
	
	
	System.out.println(m1.equals(m6));
	System.out.println(m1.hashCode());
	System.out.println(m6.hashCode());
	
	
}
}
