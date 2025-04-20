package PatternPrint;

public class RightTran12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, count = 10;
		for(a =1; a<=count;a++) {
			for(b = 1; b<=a; b++) {
				System.out.print(" "+a);
			}
			System.out.println(" ");
		}
	}

}
