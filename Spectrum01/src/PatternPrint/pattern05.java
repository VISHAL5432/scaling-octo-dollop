package PatternPrint;

public class pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4; int count = 10;
		for(int i=1;i<=row;i++) {
			for(int j = row; j>=i; j--) {
				System.out.print(count--);
			}
			System.out.println();
		}
	}

}
