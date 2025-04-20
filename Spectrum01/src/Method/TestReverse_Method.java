package Method;

public class TestReverse_Method {

	public static void main(String[] args) {
		String nam = "Sanjana";
		System.out.println(nam);
		int n = nam.length();
		int i;
		for( i = n-1; i>=0; i--) {
			System.out.print(nam.charAt(i));
		}
	

	}

}
