package oopQuestion;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Ques04 {

	public static void main(String[] args) {
		 Date lDf = new Date();
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/yyyy");
		 String stf = sdf.format(lDf);
		 System.out.println("Date is : "+stf);
		  
	}

}
