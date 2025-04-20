package InterviewQues;

public class Pattern01 {

	public static void main(String[] args) {
		 for(int i=1;i<=7;i++) {
			 for(int k=6;k>=i;k--) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 if(i%2==0) {
					 if(i==3 ||j==4&& i==7||(j==2&&j==6)) { 
					 System.out.print(""); 
				 }
			 }
				 else {
				 System.out.print("* ");
				 }
			 }
				 
			 System.out.println();
		 }
		

	}

}
