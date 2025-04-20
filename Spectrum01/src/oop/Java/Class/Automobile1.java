package oop.Java.Class;

public class Automobile1 {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	 
	public void apBreak( ) {
		speed += 20;
		System.out.println("Speed is decreased by 20");		}
	 
	public void changeGear() {
		 if(speed <10) {
			 System.out.println("Change gear According to speed");
		 }
	}
	 
	public void accelerate() {
		speed += 10;
		System.out.println("Speed increased by 10 ");
	}
	public int getSpeed1() {
		return speed;
	}
	
}
