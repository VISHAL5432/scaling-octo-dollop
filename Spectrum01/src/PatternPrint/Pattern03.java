package PatternPrint;

public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 4;
		int num =1;
		for(int i =1; i<= row;i++) {
			
			for(int j =1; j<= i;j++) {
				
				System.out.print(num++);
			 
			}
			System.out.println();
		}
		
		
	}

}
