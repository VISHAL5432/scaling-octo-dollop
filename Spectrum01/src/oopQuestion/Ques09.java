package oopQuestion;

public class Ques09 {

	public static String main(String str ) {
		 StringBuilder result = new StringBuilder();
		    
		    for (int i = 0; i < str.length(); i++) {
		        char current = str.charAt(i);
		        if (result.indexOf(String.valueOf(current)) == -1) {
		            result.append(current);

	}
		        return result.toString();
		 
}
			return str;
		    
		    }
}