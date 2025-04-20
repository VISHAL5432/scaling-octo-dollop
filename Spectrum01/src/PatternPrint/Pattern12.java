package PatternPrint;

public class Pattern12 {
	 public static void main(String arg[]) {
		 for(int a=1; a<=5;a++) {
			 for(int k=4;k>=a;k--) {
				 System.out.print(" ");
			 }
			 for(int b=1;b<=a;b++) {
				 System.out.print("* ");
			 }
			 System.out.println( );
		 }
		 for(int i=4;i>=1;i--) {
			 for(int x=1;x<=5-i;x++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print("* ");
			 }
			 System.out.println( );
		 }
	 }
	 }

