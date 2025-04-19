package MultiThreading_01;

public class Question {
	 String question;
	    String[] options;
	    int correctOption; // 0, 1, 2, or 3

	    public Question(String question, String[] options, int correctOption) {
	        this.question = question;
	        this.options = options;
	        this.correctOption = correctOption;
	    }

	    public void display() {
	        System.out.println(question);
	        for (int i = 0; i < options.length; i++) {
	            System.out.println((char)('A' + i) + ": " + options[i]);
	        }
	    }

	    public boolean isCorrect(char userChoice) {
	        return (userChoice - 'A') == correctOption;
	    }
}
