package Abstraction;

public abstract class Animal {
	public abstract void sound();
	public static void main(String[] args) {
		Animal a = new Lion();
		Animal a2 = new Tiger();
		a.sound();
		a2.sound();
	}
}
