package Interface01;

public class TestC {

	public static void main(String[] args) {
		 CInter cd = new CInter() {

			@Override
			public void show() {
				 System.out.println("Show of Cinter is Annonymous !");
				
			}
			 
		 };
		 cd.show();
		 
		 System.out.println("---------------------------------------------");
		 
		 
		 CInter cc = ()->{
			 System.out.println("CInter using Lambda !");
			 
		 };
		 cc.show();

		 
		 System.out.println("-----------------------------------------------");
		 CInter cl = ()-> System.out.println("Cinter using lambda");
		 cl.show();
	}

}
