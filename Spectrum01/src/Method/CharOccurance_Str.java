package Method;

public class CharOccurance_Str {

	public static void main(String[] args) {
		 String str = "my name depends on situation or time perion !";
		 int count = 0;
		 char cr = 'e';
		 System.out.print(" Occurance of char count : "+ cr + " = ");
		 for (int i = 0; i<= str.length()-1; i++) {
			if( cr == str.charAt(i)) {
				count++;
				
			}
			
		 }
		 System.out.print(count);
	}

}
