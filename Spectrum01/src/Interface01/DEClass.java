package Interface01;

public class DEClass implements DInter,EInter {

	public static void main(String[] args) {
		 DEClass obj = new DEClass();
		 obj.hello();
		 obj.hi();
		 obj.show();
		 obj.wish();
		          
	}

	@Override
	public void hi() {
		 System.out.println("HI at DEClass of EInter !");
		
	}

	@Override
	public void hello() {
		 System.out.println("Hello at DEClass of DInter");
		
	}

}
