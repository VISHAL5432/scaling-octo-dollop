package FileHandling01;
//  file reader for reading text files. 
 
import java.io.FileWriter;
import java.io.IOException;

public class File_Write {

	public static void main(String[] args)throws IOException {
		FileWriter fw = new FileWriter("E:\\new01\\monu");
		
		fw.write("\n My name is chota Don ");
		fw.write("\n Chota Don have some pittal which is kept in box ");
		fw.write("\n He/She is very Dangerous Boy/ Girl");
		fw.close();
		System.out.println("Data Writen SuccessFully");
	}

}
