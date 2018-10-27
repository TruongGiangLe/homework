package chapter06.oop.adv;

public class Superman  extends Laptop  implements People, Bird {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Superman.eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Superman.sleep");
	}
// để kể thừa từ 1 interface thì phải dùng từ khoá implements

	public void abc() {
		System.out.println("Superman.abc");
	}

@Override
public void fly() {
	// TODO Auto-generated method stub
	System.out.println("Superman.fly");
}

@Override
public void mainboard() {
	// TODO Auto-generated method stub
	System.out.println("Superman.mainboard");
	
}

}
