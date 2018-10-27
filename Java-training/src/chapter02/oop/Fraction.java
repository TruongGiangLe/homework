package chapter02.oop;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction( int numerator, int denominator) {
		this.denominator = denominator;
		this.numerator   = numerator;
	}
	
	public Fraction(Fraction fractionA, Fraction fractionB, String operator ) {
//		fractionA.normallize();
//		fractionB.normallize();
//		
		switch (operator) {
		case "+":
			this.add(fractionA, fractionB);
			break;
		case "-":
			this.sub(fractionA, fractionB);
			break;
		case "*":
		case "x":
			this.multiply(fractionA, fractionB);
			break;
		case "/":
		case ":":
			this.divide(fractionA, fractionB);
			break;

		default:
			break;
		}
		
	}
	
	//Tạo phần hiển thị cho phấn số

	public String print() {
		return this.getNumerator() + "/" + this.getDenominator();
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
//	
//	//Rút gọn phân số
	public void normallize() {
		int ucln = UCLN(this.denominator, this.numerator);
		if(ucln != 1) {
		this.numerator = this.numerator / ucln;
		this.denominator = this.denominator / ucln;
	}
	}
	
	//Tổng hai phấn số x/y + a/b = (x*b + a*y)/(y*b)
	private void add( Fraction fractionA, Fraction fractionB) {
		this.numerator = fractionA.numerator*fractionB.denominator + fractionB.numerator*fractionA.denominator;
		this.denominator = fractionA.denominator*fractionB.denominator;
		this.normallize();
	
		
	}
	 
	//Hiệu hai phấn số x/y - a/b = (x*b - a*y)/(y*b)
	private void sub( Fraction fractionA, Fraction fractionB) {
		this.numerator = fractionA.numerator*fractionB.denominator - fractionB.numerator*fractionA.denominator;
		this.denominator = fractionA.denominator*fractionB.denominator;
		this.normallize();
		
		
		
	}
	//phép chia hai phân số
	private void divide( Fraction fractionA, Fraction fractionB) {
		this.numerator = fractionA.numerator*fractionB.denominator;
		this.denominator = fractionA.denominator*fractionB.numerator;
		this.normallize();
		
		
	}
	//phép nhân hai phân số
	private void multiply( Fraction fractionA, Fraction fractionB) {
		this.numerator = fractionA.numerator*fractionB.numerator;
		this.denominator = fractionA.denominator*fractionB.denominator;
		this.normallize();
		
		
		
	}
	private int UCLN( int x, int y) {
		int ucln = Math.min(x, y);
		while( ucln >= 1) {
			if(x % ucln == 0 && y % ucln == 0) return ucln;
			ucln--;
			}
		return ucln;
	
	}
	
	public boolean checkNormallize() {
		int ucln;
		ucln = UCLN(this.numerator, this.denominator);
		if(ucln == 1) return true; else return false;
	}
	
}
