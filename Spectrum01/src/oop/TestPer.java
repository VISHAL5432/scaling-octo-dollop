package oop;

public class TestPer {

	public static void main(String[] args) {
		ConsType p = new ConsType();
		p.setName("Monika");
		p.setAge(23);
		p.setMobile("+91 7739302457");
		p.setAddress("indore");
		
		// passing two attribute inside constructor
		ConsType pp = new ConsType("Mohan", 25);
		pp.setMobile("+91 7755663484");
		pp.setAddress("Bihar");
		 // passing Four attribute in side constructor
		ConsType pt = new ConsType("Sanjana", 23, "+91 7744553366","Indore");
		
		
	}

}
