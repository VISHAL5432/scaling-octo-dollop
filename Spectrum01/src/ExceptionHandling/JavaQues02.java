package ExceptionHandling;

public class JavaQues02 {
	public void OddEven(int a) {
		try {
			if (a%2==0) {
				System.out.println("Given Num is Even : "+ a);
				}else {
	                throw new IllegalArgumentException("Odd Number"); // Explicitly throw an exception for odd numbers
	            }
		}
		catch(IllegalArgumentException  vis) {
			System.out.println("Given num is Odd num : "+ a);
		}
	}
	public static void main(String[] args) {
		  JavaQues02 aa = new  JavaQues02(); 
			  aa.OddEven(88);
			  aa.OddEven(77);
		  

	}

}
