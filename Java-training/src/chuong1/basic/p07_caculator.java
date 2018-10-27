package chuong1.basic;

import java.util.Scanner; // phải có cái này



public class p07_caculator {
	public static void main(String[] args) {
		int numberFirst;
		int numberSecond;
		int result = 0;
		String caculate;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("numberFirst: ");
		numberFirst = sc.nextInt();
		sc.nextLine();
		
		System.out.print("numberSecond: ");
		numberSecond = sc.nextInt();
		sc.nextLine();
		
		System.out.print("caculate: ");
		caculate = sc.nextLine();
		sc.close();
		
		
//		
//		System.out.println("numberSecond: " + numberSecond);
//		System.out.println("numberFirst:" + numberFirst);
//		System.out.println("caculate:" + caculate);
		
		// + - * / x : %
		 
		switch (caculate) {
		case "+": 
			result = numberFirst + numberSecond;
			break;
		case "-":
			result = numberFirst - numberSecond;
			break;
			
		case "x":
		case "*":
			result = numberFirst * numberSecond;
			break;
		
		case "%":
			result = numberFirst % numberSecond;
			break;
		
		case "/":
		case ":":
		    result = numberFirst / numberSecond;
			break;
			
		default:
			break;
		}
		System.out.printf("%d %s %d = %d", numberFirst, caculate, numberSecond, result);
		
		
		
	
		
		
	}

}
