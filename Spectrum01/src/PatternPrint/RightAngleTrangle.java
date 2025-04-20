package PatternPrint;

public class RightAngleTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ; int count = 10; int b;
		for(a = 1; a<= count; a++) {
			for(b=1; b<=a;b++) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}

}
