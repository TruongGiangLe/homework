package chuong1.basic;

public class p04math_functions {
	public static void main(String[] args){
//		int numberOne     = 15;
//		int numberTwo     = 125;
//		int numberThree   = 185;
//	
//		double numberThree= 123.3;
//		
//		double result     = Math.ceil(numberThree);
//
//		System.out.println(" result = " + result);
//		System.out.println(Math.floor(numberThree));
//		System.out.println(Math.round(numberThree));
//		double randomNumber = Math.random();
//		System.out.println(randomNumber);
//		int result      = Math.max(numberOne, numberTwo);
//		System.out.println(Math.max(result, numberThree));
		int max     = 19;
		int min     = 14;
		int range   = (max - min) + 1;
		int result  = (int)(Math.random() * range) + min;
		System.out.println(result);
	
	}

}
