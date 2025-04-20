package PatternPrint;

public class Pattern19 {

	public static void main(String[] args) {
		 
		 int height = 5; 
	         
	        for (int i = 0; i < height; i++) {
	        	 
	            for (int j = 0; j < height; j++) {
	                
	                if (j == 0 || j == height - 1 || j == i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");  
	                }
	            }
	            System.out.println();  
	        }
	}

}
 