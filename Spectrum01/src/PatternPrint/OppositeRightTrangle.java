package PatternPrint;

public class OppositeRightTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, count =10;
		for (a= count; a>=1;a--) {
			for(b =a; b>=1; b--) {
				System.out.print('*');
			}
			System.out.println(" ");
		}
		
	}

}
/*output :- *********
			********
			******* 
			******
			*****
			****
			***
			**
			* 
	*/