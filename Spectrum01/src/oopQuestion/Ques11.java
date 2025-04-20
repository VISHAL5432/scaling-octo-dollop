package oopQuestion;

public class Ques11 {

	public static void main(String[] args) {
		  String s = "This is a test String"; 
		   String r = "";
		   for(String w : s.split(" ")) 
			   r += new StringBuilder(w).reverse()+ " ";
			   System.out.println(s+ " \n"+ r.trim());
		   

	}

}
