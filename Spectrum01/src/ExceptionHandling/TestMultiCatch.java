package ExceptionHandling;

public class TestMultiCatch {

	public static void main(String[] args) {
		 String  name = "Ramlal";
		 try {
			 System.out.println( "String length : "+name.length());
			 System.out.println(name.charAt(7));
		 }catch(NullPointerException e) {
			 System.out.println("Nmae not found ");
		 }catch(StringIndexOutOfBoundsException b) {
			 System.out.println("Char not  found ");
		 }finally {
			 System.out.println("I am human");
		 }

	}

}
