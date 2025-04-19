package MultiThreading_01;

public class TestNo {

	public static void main(String[] args) {
		NoThread n1 = new NoThread("Mohan");
		NoThread n2 = new NoThread("Radha");
		
		n1.run();
		n2.run();
	}

}
