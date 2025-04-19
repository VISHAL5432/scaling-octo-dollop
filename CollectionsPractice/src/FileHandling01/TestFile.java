package FileHandling01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) throws IOException {
		 File fl = new File("E:\\new01//monu.txt");
		
		 if(fl.exists()) {
			 System.out.println(fl.isFile());
			 System.out.println(fl.getAbsolutePath());
			 System.out.println(fl.getName());
			 System.out.println(fl.isDirectory());
			 System.out.println(fl.canExecute());
			 System.out.println(fl.canRead());
			 System.out.println(fl.canWrite());
			 System.out.println(fl.isFile());
			 System.out.println(fl.length()+" Bytes");
			 System.out.println(new Date((fl.lastModified())));
			 
		 }
		 else {
			 System.out.println("File not Exists : ");
			 fl.createNewFile();
			 System.out.println("Now File Is Created :");
		 }
		 
	}

}
