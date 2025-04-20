package Method;
import java.util.Scanner;
public class Palendrome {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter a String : ");
		 String str =sc.nextLine();
	
		//String s="sanas";
		  String t ="";
		
		System.out.println("---------");
		for(int i=str.length()-1;i>=0;i--)
		{
			t += str.charAt(i);
		}
		if(t.equals(str))
			System.out.println("String is palindrome ");
		else
			System.out.println("not palindrome");
		
		
		sc.close();
}
}
