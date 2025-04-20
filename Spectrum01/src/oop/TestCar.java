package oop;

public class TestCar {

	public static void main(String[] args) {
		 Car01 alto = new Car01();
		 alto.changeName("Alto 700");
		 alto.changeColor("MAT-Black");
		 alto.accelerate();
		 alto.accelerate();
		 alto.accelerate();
		 alto.accelerate();
		 alto.changegear(4);
		 alto.accelerate();
		 alto.pressBreak();
		 System.out.println(alto.getSpeed()+" "+ alto.getGear()+ " "+ alto.getColor());
		 
	}

}
