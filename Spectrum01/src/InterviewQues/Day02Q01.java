package InterviewQues;

public class Day02Q01 {

	public static void main(String[] args) {
		 int n= 10,x=0,y=1,z=1;
		 System.out.print(x+","+y+","+z+",");
		 for(int i=1;i<=n;i++) {
			 int next = x+y+z;
			 System.out.print(next+",");
			 x=y;
			 y=z;
			 z=next;
		 }

	}

}
