package PatternPrint;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i = 'a'; i<='e'; i++) {
			for (char k ='e'; k >= i; k--) {
				System.out.print(" ");
			}
			for(char j = 'a'; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println( );
		}
	}

}
