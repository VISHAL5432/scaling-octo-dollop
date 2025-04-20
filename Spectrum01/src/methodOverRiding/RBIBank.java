package methodOverRiding;

public class RBIBank {
	public double intrestRate() {
		return 0.0;
	}  
}
class AxisBank extends RBIBank{
	public double intrestRate() {
		return 10.5;
	}
}
class ICICIBank extends RBIBank{
	public double intrestRate() {
		return 8.5;
	}
}
class SBIBank extends RBIBank {
	public double intrestRate() {
		return 9.5;
	}
}