package oopQuestion;

public class Ques12 {

	public static void main(String[] args) {
		 String s = "welcome";
		 int rep = 2;
		 StringBuilder res = new StringBuilder();
		 int l = s.length();
		 for ( int i=0; i<l;i++) {
			 char ch = s.charAt(i);
			 for(int j = 0; j< rep; j++) {
				 res.append(ch);
			 }
		 }
		 System.out.println(res.toString());
	}

}
