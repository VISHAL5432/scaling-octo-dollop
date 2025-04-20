package oopQuestion;
import java.util.Arrays;
public class Ques14 {
	public static void main(String[] args) {
		 String colr[]  = {"Green","White","Black","Pink","Orange","Blue","Champagne","Indigo","Ivory"};
		int s= colr.length;
		System.out.println("String length : "+s);
		 Arrays.sort(colr);
		
		 System.out.println("Sorted ArrayString : "+Arrays.toString(colr));
	}

}
