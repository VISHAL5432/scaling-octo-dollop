package FileHandling01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSeriaziable {

	public static void main(String[] args) throws IOException {
		 FileOutputStream fos = new FileOutputStream("E:\\new01\\mannage.ser");
		 ObjectOutputStream  oos = new ObjectOutputStream(fos);
		 Student_01 st = new Student_01("Prabhu","0177CS201012",23,"Bihar","I am a studid");
		 Student_01 st1 = new Student_01("Pramodh","0177CS201014",24,"Belaur","I am a studid");
		 Student_01 st2 = new Student_01("Prakash","0177CS201015",25,"Bagheli","I am a studid");
		 Student_01 st3 = new Student_01("Pransh","0177CS201017",27,"Birampur","I am a studid");
		 Student_01 st4 = new Student_01("Prateek","0177CS201010",28,"Balasad","I am a studid");
		 Student_01 st5 = new Student_01("Pranjal","0177CS201013",22,"Bhojpur","I am a studid");
		 Student_01 st6= new Student_01("Prabhunath","0177CS201019",33,"Bhopal","I am a studid");
		 oos.writeObject(st);
		 oos.writeObject(st1);
		 oos.writeObject(st2);
		 oos.writeObject(st3);
		 oos.writeObject(st4);
		 oos.writeObject(st5);
		 oos.writeObject(st6);
		 fos.close();
		 System.out.println("Data Persisted ");
		 
	}

}
