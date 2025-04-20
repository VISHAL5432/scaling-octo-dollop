package PatternPrint;

public class PatternCrazy {

	public static void main(String[] args) {
		for(int d= 1; d<=5; d++) {
			for(int e = 4; e>=d; e--) {
				System.out.print(" ");
			}
			for(int f = 1; f<=d; f++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------(4)");
		
		
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
		System.out.println("------------------------------------(5)");
		
		for (int ja= 1; ja<=5; ja++) {
			for( int ka= 1; ka<=5; ka++) {
				if(ka==1||ja==5) {
					System.out.print(" *");
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------(6)");	
		for(int m = 1; m<=5; m++) {
			for(int n = 1; n <=5; n++) {
				if(m==1||m==5||n==1||n==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println(" -------------------------------------(7)");

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

		
System.out.println("-----------------------------------------(8)");
		
		for(int pa = 1; pa<=5; pa++) {
			for(int ga = 1; ga<=5; ga++) {
				if(ga==1||pa==1||pa==3||pa==5) {
					System.out.print(" *");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
        
		System.out.println("---------------------------------------(9)");
		
		for(int la = 1; la<=5; la++) {
			for(int ma= 1; ma<=5; ma++) {
				if(la==5 && ma==1||ma==2||ma==3||ma==4 || ma==3 && la==5)  {
					System.out.print(" " );
				}else {
					System.out.print("  * ");
				}
				
			}
			System.out.println();
		}

	}

}
