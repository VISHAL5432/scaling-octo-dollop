package MultiThreading_01;

public class TestWith {

	public static void main(String[] args) {
		WithThread th1 =new WithThread("Mohan");
		WithThread th2 = new WithThread("Radha");
		
		th1.start();
		th2.start();
		System.out.println("TH1 name : "+ th1.getName());
		System.out.println("TH1 Prioity : "+ th1.getPriority());
		System.out.println("ID : "+th1.getId());
		System.out.println("STATE" + th1.getState());
	}

}
