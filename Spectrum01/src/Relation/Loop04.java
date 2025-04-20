package Relation;

public class Loop04 {

	public static void main(String[] args) {
		int sa =12;
		int square = 1;
		int cube = 1;
		for(int i =1; i<=sa; i++) {
			square = (i*i);
			cube = (i*i*i);
			System.out.println("Square of " + i +" -> "+square+ "   "+"Cube of " + i+"-> " +cube);
			 
		}
		

	}

}
