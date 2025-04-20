package PatternPrint;

public class MyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 7; 
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < 2 * n - 1; j++) {
	               
	                if (j == i || j == (2 * n - 2 - i)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); 
	        
	        }
	        for(int as = 1; as<=5; as++) {
				for(int ad = 1; ad<=5; ad++) {
					if(as==1||as==5||ad==3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
	}
	        
	        for(int s=1; s<5; s++) {
	        	for(int t=1;t<5;t++) {
	        		if(s==1||s==3||s==5||t==1||t==5) {
	        			//if ((s==5 && t==2)||(s==4 && t==1)) {
	        				System.out.print(" ");
	        			}
	        			System.out.print("*");
//	        		}else {
//	        			System.out.print(" ");
//	        		 
//	        	}
	        	System.out.println();
	        }
	        }
	}}

