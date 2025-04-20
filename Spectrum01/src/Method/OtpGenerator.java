package Method;

public class OtpGenerator {

	public static void main(String[] args) {
		String otp = "";
	//System.out.println(Math.random()*10);
	for (int i = 1; i<=6;i++) {
		int r = (int)(Math.random()*10);
		otp = otp + r; 
	}
	System.out.println("Otp = "+ otp);

	}

}
