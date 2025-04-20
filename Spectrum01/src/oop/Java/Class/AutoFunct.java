 package oop.Java.Class;

public class AutoFunct {

	public static void main(String[] args) {
		 Automobile1 safari = new Automobile1();
		 safari.setColor("Red");
		 safari.setMake("TATA-Automobile");
		 safari.setSpeed(200);
		 safari.accelerate();
		 safari.apBreak();
//		 Automobile1 harier = new Automobile1();
//		 harier.setColor("Black");
//		 harier.setMake("TATA-Automobile");
//		 harier.setSpeed(220);
//		 Automobile1 alto = new Automobile1();
//		 alto.setColor("Yellow");
//		 alto.setMake("TATA-Automobile");
//		 alto.setSpeed(110);
//		 Automobile1 scarpio =new Automobile1();
//		 scarpio.setColor("White");
//		 scarpio.setMake("Mahendra");
//		 scarpio.setSpeed(230);
		 System.out.println("Safari Details : ");
		 System.out.println("color: "+safari.getColor()+" "+ "Company: "+ safari.getMake()+" "+"Speed : "+ safari.getSpeed());
//		 System.out.println("color: "+alto.getColor()+" "+ "Company: "+alto.getMake()+" "+"Speed : "+ alto.getSpeed());
//		 System.out.println("color: "+harier.getColor()+" "+ "Company: "+ harier.getMake()+" "+"Speed : "+ harier.getSpeed());
//		 System.out.println("color: "+scarpio.getColor()+" "+ "Company: "+scarpio.getMake()+" "+"Speed : "+ scarpio.getSpeed());
	}

}
