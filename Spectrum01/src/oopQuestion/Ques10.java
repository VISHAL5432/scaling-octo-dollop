package oopQuestion;
 
public class Ques10 {
	public static void main(String[] args) {
		 
		String s = "abcdefghijklmnopqrstuvwxy";
		int n = 5, l = s.length(), p = l / n;
//        if (l % n != 0)
//        	return ;
        for (int i = 0; i < l; i += p)
        	System.out.print(s.substring(i, i + p) + " ");
    }
			}
		
	 
