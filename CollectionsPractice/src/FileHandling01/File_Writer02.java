package FileHandling01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_Writer02 {

	public static void main(String[] args) throws IOException {
		 FileWriter fe = new FileWriter("E:\\new01\\monu.txt" ,true);
		 PrintWriter pw =new PrintWriter(fe);
		 pw.print("My name is vishal ");
		 pw.println("My name is vishu ");
		 pw.println("My name is vishnu ");
		 pw.println("My name is vishwa ");
		 pw.println("My name is vishwajeet ");
		 pw.println("My name is vishawakarma ");
		fe.close();
		System.out.println("Data written Sucessfully");
		 
		 
		 
	}

}
