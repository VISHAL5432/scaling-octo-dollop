package oop;

public class Car01 {
	
	private String name;
	private String color;
	private int gear;
	private int speed;
	
	
	public void changeName(String nam) {
		name =nam;
	}
	public String getName() {
		return name;
	}
	public void changeColor(String clr) {
		color = clr;
		
	}
	public String getColor() {
		return color;
	}
	public void changegear(int n) {
		gear = n;
	}
	public int getGear() {
		return gear;
	}
	public void accelerate() {
		speed +=10;
		System.out.println("Speed increased by 10 !");
	}
	public int getSpeed() {
		return speed;
	}
	public void pressBreak() {
		speed -=20;
		System.out.println("Speed Decreased by 20 !");
	}
}
