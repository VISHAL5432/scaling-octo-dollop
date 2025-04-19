package FileHandling01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPhotoCopy {

	public static void main(String[] args) throws IOException {
		 FileInputStream fsi = new FileInputStream("E:\\new01\\meditation-ambience-262905.mp3");
		 FileOutputStream fos = new FileOutputStream("E:\\new01\\meditation-ambience-262905.mp4");
		 	int da = fsi.read();
		 	while(da != -1) {
		 		fos.write(da);
		 		da = fsi.read();
		 	}
		 	fos.close();
		 	System.out.println("Photo Copied Successfully");
	}

}
