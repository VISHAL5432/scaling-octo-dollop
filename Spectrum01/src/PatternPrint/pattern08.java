package PatternPrint;

public class pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
	 
		for(int i =1; i<= row;i++) {
			
			for(int j =1; j<= i;j++) {
				if(j%2==0) {
				System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			 
			}
			System.out.println();
		}
		
	}

}
