package oopQuestion;
import java.lang.*;
public class Ques07 {

	public static void main(String[] args) {
		String s1 = "The quick brown fox jump over the lazy dog";
		String s2=s1.replaceFirst("(?:d)+", "f");
	 System.out.println(s2);
		}
		
	}


