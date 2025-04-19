package FileHandling01;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class UserInputWriter {

	public static void main(String[] args) throws IOException {
		 FileWriter fw = new FileWriter("E:\\new01\\monu.txt", true);
		 PrintWriter pw = new PrintWriter(fw);
		  
		 System.out.println("Enter Data : ");
		 InputStreamReader isr = new InputStreamReader(System.in);
		 BufferedReader br = new BufferedReader(isr);
		 
		 String line = br.readLine();
		 
		 while (!line.equals("Exit")) {
			 pw.println(line);
			 line = br.readLine();
			 
		 }
		 fw.close();
		 System.out.println("Data Written Successfully");

	}

}
