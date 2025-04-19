package MultiThreading_01;

import java.util.Optional;

public class JavaQues {
	String question;
	String []options;
	int correctOption;
	public JavaQues(String question, String[] options, int correctOption) {
		super();
		this.question = question;
		this.options = options;
		this.correctOption = correctOption;
	}
	 public void display() {
		 System.out.println(question);
		 for(int i = 0; i<= options.length;i++) {
			 System.out.println((char)('A'+i) + ":" + options[i]);
		 }
	 }
	 public boolean isCorrect(char userChoice) {
		 return (userChoice - 'A')== correct-options;
	 }
}
