package PatternPrint;

public class Pattern21 {
	
	public static void main(String[] args) {
		 for(int i=1;i<=8;i++) {
			 for(int k=7; k>1;k--) {
				 System.out.print(" ");
			 }
			 for(int j=9;j>=0;j--) {
//		 if(i==1&&j==4||i==2&&j==6||i==6&&j==6) {
//					 System.out.println(" ");
//				 }else {
				 System.out.print("* ");
			 }
			 
			 System.out.println();
		 }
	}

	}


