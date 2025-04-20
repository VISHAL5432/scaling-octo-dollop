package Method;

public class MySelf {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("---------------------------(1)");
		
		for(int k = 1; k<=6; k++) {
			for(int l =1; l<=k; l++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int a = 5; a>=1; a--) {
			for(int b =1; b>=a; b--) {
				System.out.print("");
			}
			for(int c =1; c<=a;c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------(2)");
		
		for(int p = 1; p<=5; p++) {
			for(int q = 4;q>=p; q--) {
				System.out.print(" ");
			}
			for(int s = 1; s<=p; s++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		
		for(int x = 5; x>=1; x--) {
			for(int y =1; y<=5-x; y++) {
				System.out.print(" ");
			}
			for(int z = 1; z<=x; z++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		

		System.out.println("-----------------------------------------(3)");
		
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
		System.out.println();
		System.out.println();
		
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
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------(5)");
		
		System.out.println();
		System.out.println();
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
		
		System.out.println();
		System.out.println();
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
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------(7)");
		
	
		System.out.println();
		

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


		System.out.println();
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
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------------------------(10)");
		System.out.println();
		System.out.println();
		
		
		        int nam = 9; 
		        
		        for (int  ia= 0; ia < n; ia++) {
		            for (int anj = 0; anj < nam; anj++) {
		                if ((ia == anj && ia < nam / 2) || (ia + anj == nam - 1 && ia < nam / 2) || (anj == nam / 2 && ia >= nam / 2)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }


		
		
		System.out.println("-----------------------------------------(9)");		
	
		
		System.out.println();
		System.out.println();
	
		
		for(int op = 1; op<=5; op++) {
			for(int pa = 1; pa <=5; pa++) {
				if(op==1||op==5||pa==1||pa==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------(10)");

		System.out.println();
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i == 5 && j == 1) || (i == 5 && j == 5)) {
					System.out.print("  ");
				}
				else if( j == 1 || i== 5 || j == 5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
