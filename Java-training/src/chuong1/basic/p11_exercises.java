package chuong1.basic;

import java.util.Scanner;

public class p11_exercises {
	public static void main(String[] args) {
		//exercise 1:
//		int number;
//		System.out.println("enter n (n le) :");
//		Scanner sc =  new Scanner(System.in);
//		number = sc.nextInt();
//		sc.close();
//		int n = 1;
//		while(n <= number) {
//			if(n == 1 || n == number) {
//				for(int i = 1; i <= number; i++) {
//					System.out.print("*");
//					//System.out.println();
//					}
//				System.out.println();
//			} else if(n == (number/2 + 1)) {
//				for(int j = 1; j <= number/2; j++)
//					System.out.print(" ");
//				System.out.print("* \n");
//			} else if( 2 <= n && n <= number/2) {
//				String space1     = "";
//				String space2     = "";
//				String line     = "";
//				for(int i = 1; i < n; i++) space1 = space1 + " ";
//				for(int i = 1; i <= number - 2*n; i++) space2 = space2 + " ";
//				line = space1 + "*" + space2 + "*" + "\n";
//				System.out.print(line);
//				
//				} else {
//					String space1     = "";
//					String space2     = "";
//					String line      = "";
//					for(int i = 1; i <= number - n; i++) space1 = space1 + " ";
//					for(int i = 1; i <= 2*n - number - 2; i++) space2 = space2 + " ";
//					line = space1 + "*" + space2 + "*" + "\n";
//					System.out.print(line);
//					
//					
//					
//					
//				}
//			
//			
//			
//			n++;
//		}
//	
		
		//exercise 2:
		int number ;
		int n = 1;
		System.out.println("enter n: (n le) ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
			
		//String result     = "";
		while(n <= number) {
			if(n == number / 2 + 1) {
				for(int i = 1; i <= number; i++)
					System.out.print("*");
				System.out.println();
			} else
			if(1 <= n && n <= number / 2) {
				String space = "";
				String character = "";
				String result = "";
				for( int i = 1; i <= number/2 + 1 - n; i++ ) space = space + " ";
				for( int i = 1; i <= 2*n - 1; i++) character = character + "*";
				result = space + character + "\n";
				System.out.print(result);
				} else {
					String space = "";
					String character = "";
					String result = "";
					for(int i = 1; i <= (2*n - number - 1)/2; i++) space = space + " ";
					for(int i = 1; i <= 2*(number - n) + 1; i++) character = character + "*";
					result = space + character + "\n";
					System.out.print(result);
					
					
				}
			
			
			
		n++;	
		}
		
		
	}

}
