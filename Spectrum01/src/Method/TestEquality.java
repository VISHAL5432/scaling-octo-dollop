
package Method;

public class TestEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
         String s1 = new String("Java");
         String s2 = new String("Java");
         String s3 = "Java";
         String s4 = "Java";
         System.out.println(s1.equals(s2));
         System.out.println(s1.equals(s4));
         System.out.println(s1==s2);
         System.out.println(s1==s4);
	}

}
