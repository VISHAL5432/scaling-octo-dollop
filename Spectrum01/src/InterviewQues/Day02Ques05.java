package InterviewQues;

public class Day02Ques05 {

	public static void main(String[] args) {
		int n = 5;
        String s = "1";
        System.out.println(s);
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) count++;
                else {
                    next.append(count).append(s.charAt(j - 1));
                    count = 1;
                }
            }
            next.append(count).append(s.charAt(s.length() - 1));
            s = next.toString();
            System.out.println(s);
        }
	}

}
