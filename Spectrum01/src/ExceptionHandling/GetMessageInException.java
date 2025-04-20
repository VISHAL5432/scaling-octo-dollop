package ExceptionHandling;

public class GetMessageInException {

	public static void main(String[] args) {
		 String name = " Sonu Lal";
		 try {
			 System.out.println("String Length : "+ name.length());
			 System.out.println(name.charAt(9));
		 }
		 catch(NullPointerException e) {
			 System.out.println(e.getMessage());
		 }
		 catch(StringIndexOutOfBoundsException c) {
			 System.out.println(c.getMessage());
		 }
		 finally {
			 System.out.println("I am a Roboat ");
		 }
	}

}
