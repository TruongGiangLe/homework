package chapter04_exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			myFunction(2,2);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// throw và throws
	public static void myFunction(int number1, int number2) throws ArithmeticException, Exception {
		if( number2 == 0) throw new ArithmeticException(" lỗi chia cho 0");
		if( number2 %2 == 0) throw new ArithmeticException(" lỗi chia cho số chẵn");
		
		System.out.println(number1/number2);
		
		
		 
	}
	
	
	
	
	
	
	public static void Study005() {
		int number1     = 5;
		int number2     = 0;
		System.out.println("nhan the ATM");
		try {
			System.out.println(number1/number2);
		} finally  {
			// TODO: handle exception
			System.out.println("tra the ATM");
			//các câu lệnh trong khối finally luôn được thực hiện dù có hay không có 
			// exception xảy ra
			
			
		}
		//System.out.println("tra the ATM");
		
		
		
		
	}
	
	
	
	
	public static void Study004() {
		int number1     = 5;
		int number2     = 0;
		System.out.println(number1/number2);
		
		
		
		
	}
	
	
	
	public static void Study003() {
		int number1    = 5;
		int number2    = 1;
		int[] array = new int[3];
		array[0]  = 1;
		
		array[1]  = 2;
		
		array[2]  = 3;
		
		
		System.out.println("nhan the ATM");
		
		try {
			// trong try là khối lệnh nghi ngờ có exception
			System.out.println(number1/number2);
			System.out.println(array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			System.out.println("error: " + e.getMessage());
		    e.printStackTrace();
		} catch(Exception e) {
			// class cha exception phải đặt dưới các class con
			e.getMessage();
			System.out.println("error: " + e.getMessage());
		    e.printStackTrace();
			
			
		}
		System.out.println("tra the ATM");
		
		
		
		
	}
	
	
	
	
	
	public static void Study002() {
		int[] array = new int[3];
		array[0]  = 1;
		
		array[1]  = 2;
		
		array[2]  = 3;
		System.out.println(array[3]);
		}
	
	
	
	public static void Study001() {
		System.out.println(" nhan the ATM:");
		System.out.println(5/0);
		System.out.println(" tra the ATM: ");
		
		
	}

}
