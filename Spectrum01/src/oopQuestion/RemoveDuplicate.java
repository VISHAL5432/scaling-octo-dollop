package oopQuestion;
import java.util.*;
public class RemoveDuplicate {
		static void remDu(char ch[],int length) {
			int index = 0;
			int le =ch.length;
			for(int i=0; i<le;i++) {
				int j =0;
				for(j=0;j<i;j++) {
					if(ch[i]==ch[j]) {
						break;
					}
				}
			if(j==i) {
				ch[index++]=ch[i];
			}
			}
			System.out.println(String.valueOf(Arrays.copyOf(ch,index)));
		}
	public static void main(String[] args) {
		String st = "if you got forgoten any thing than try to assume the past events!";
		char ch[] = st.toCharArray();
		int len = st.length();
		remDu(ch,len);
	}
}
