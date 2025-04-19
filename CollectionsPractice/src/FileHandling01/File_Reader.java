package FileHandling01;
 
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) throws IOException {
     FileReader fr = new FileReader("E:\\new01//monu.txt");
		 
		 int dr = fr.read();
		
		 while (dr !=-1) {
			 char cc = (char) dr;
			 System.out.print(cc);
			 dr = fr.read();
		 }
		 fr.close();

	}

}
