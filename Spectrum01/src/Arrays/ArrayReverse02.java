package Arrays;

public class ArrayReverse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int g []= {8,9,7,5,6,98};
//		//int c = g.length;
//		for(int i=g.length-1; i>=0; i--) {
//			System.out.print(g[i]+",");
//		}
//	}
//
//}
//		int e[]=new int[7];
//			 e[0]=23;
//			 e[1]=22;
//			 e[2]=12;
//			 e[3]=13;
//			 e[4]=43;
//			 e[5]=65;
//			 e[6]=76;
//			// e[7]=98;
//			 int r[];
//	for(int i=0; i<=e.length-1;i++) {
//		System.out.println();
//	}
		char cf[] = {'w','e','r','t','y'};
		char cr[] = new char[5];
		System.arraycopy(cf, 0, cr, 0, 5);
		System.out.println(cr);
	}
	}