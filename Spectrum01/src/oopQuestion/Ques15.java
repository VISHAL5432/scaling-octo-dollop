package oopQuestion;
import java.util.*;
public class Ques15 {
	public static void main(String[] args) {
		String st = "Java is programing language ";
		Scanner it =new Scanner(System.in);
		System.out.print("Enter a String :");
		String sc = it.nextLine();
		if(sc==st) {
			System.out.println(" Input String is Same as Given String : "+sc);
		}
		else {
			System.out.println(" Input String is not same as Given string : "+sc);
		}
		 it.close();
	}
}
