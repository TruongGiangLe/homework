package chapter06.oop.adv;

public class LaptopDell extends Laptop {

//	public LaptopDell() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public void keyboard() {
		System.out.println("LaptopDell.keyboard()");
	}

	@Override
	public void mainboard() {
		// TODO Auto-generated method stub
		System.out.println("LaptopDell.mainboard()");
	}
}
