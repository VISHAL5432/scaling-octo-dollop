package Method;

import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;
class TestDate {

//	private static final int MM = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.getDate() + "/"+(dt.getMonth()+1)+ "/" + (1900 + dt.getYear()));
		dt.setDate(20);
		dt.setMonth(10);
		dt.setYear(125);
		System.out.println(dt);
		 
		//Simple Date format
		SimpleDateFormat sd= new SimpleDateFormat("dd/MMM/yyyy");
		String st = sd.format(dt);
		System.out.println(st);
	}

}
