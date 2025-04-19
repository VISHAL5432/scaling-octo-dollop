
package FileHandling01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserializable {

	public static void main(String[] args)throws IOException ,ClassNotFoundException {
		 FileInputStream fis = new FileInputStream("E:\\new01\\mannage.ser");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		for(int i =1;i<=7;i++) {
		 Student_01 s =  (Student_01)ois.readObject();
		 System.out.println(s.getName()+" "+s.getRollno()+" "+s.getAge()+" "+s.getAddress()+" "+s.getTemp());
	}
	}

}
