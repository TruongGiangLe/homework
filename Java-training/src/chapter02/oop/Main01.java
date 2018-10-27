package chapter02.oop;

public class Main01 {
	
	public static void main(String[] args) {
		Fraction fractionA = new Fraction(2,3);
        Fraction fractionB = new Fraction(5, 6);
        Fraction fractionC = new Fraction(fractionA, fractionB, "-");
        System.out.println(fractionC.print());
		
	}
	
	
	
	
	public static void main001(String[] args) {
	
	Fraction fractionA = new Fraction(2, 4);
	Fraction fractionB = new Fraction(3, 9);
	System.out.println(fractionA.print());
	System.out.println(fractionB.print());
	
	
	

}
}
