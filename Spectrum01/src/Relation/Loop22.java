package Relation;

public class Loop22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10; int x= 0; int y =1;
		for(int i=1; i<= n; i++) {
			x = x + y;
			y = x - y;
			System.out.print(x+",");
		}
		 
	}

}
