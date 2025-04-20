package Relation;

public class Loop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 234567;
		System.out.println("Num :"+s);
		int rem , rev =0;
		while(s>0) {
			rem = s%10;
			rev =rev * 10 +rem;
			s =s/10;
		}
		System.out.println("Reversed num : "+rev);
	}

}
