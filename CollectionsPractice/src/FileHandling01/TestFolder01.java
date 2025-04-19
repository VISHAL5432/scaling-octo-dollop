package FileHandling01;

import java.io.File;
import java.io.IOException;

public class TestFolder01 {

	public static void main(String[] args) throws IOException {
		//File fl = new File("E:\\new01","ff\\try.txt");
		File fl = new File("E:\\new01\\rtry.txt");
		if(fl.exists()) {
		 System.out.println(fl.getAbsolutePath());
		 System.out.println(fl.getName());
		 System.out.println(fl.isDirectory());
		 System.out.println(fl.canExecute());
		 System.out.println(fl.canRead());
		 System.out.println(fl.canWrite());
		 System.out.println(fl.isFile());
		 System.out.println(fl.length()+" Bytes");
		 System.out.println(fl.delete());
		}
		else {
			System.out.println("Folder Doesn't Exists");
			//fl.mkdir();
			fl.createNewFile();
			
			System.out.println("Now Folder/Directory Exists ");
		}
	}

}
