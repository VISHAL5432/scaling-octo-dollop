package Method;

public class Inbuilt_Methods {

	public static void main(String[] args) {
		// Some inbuilt methods
		 String name = "My Name is Chota Ravan!";
		 System.out.println(name.length());
		 System.out.println(name.charAt(3));
		 System.out.println(name.indexOf('N'));
		 System.out.println(name.indexOf('o'));
		 System.out.println(name.lastIndexOf('a'));
		 System.out.println(name.toLowerCase());
		 System.out.println(name.toUpperCase());
		 System.out.println(name);
		 System.out.println(name.replace("Ravan","Don"));
		 System.out.println(name.replace('a', '$'));
		 System.out.println(name.concat("Mohan"));
		 System.out.println(name.contains("v"));
		 System.out.println(name.substring(4));
		 System.out.println(name.substring(3, 9));
		 System.out.println(name.startsWith("My"));
		 System.out.println(name.endsWith("Ravan!"));
		 
	}

}
