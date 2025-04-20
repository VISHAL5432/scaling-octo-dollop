package PatternPrint;

public class Pattern11 extends Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1; a<=5;a++) {
			for(int b=1;b<=a; b++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			 System.out.print("*");
		}
		System.out.println( );
	}
	}

}
