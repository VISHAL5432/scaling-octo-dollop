package Interface01;

public class ClassB {

	public static void main(String[] args) {
		 BInter bi = new BInter() {
			 	// using  interface without using implement or inherting any class
			@Override
			public void hi() {
				 
				System.out.println("Hi from  BInter to Annonymous Class ");
			}

			@Override
			public void wish() {
				 System.out.println("Wish from BInter at Annonymous class");
				
			}
			 
			 
		 };
		 bi.hi();
		 bi.wish();
	}

}
