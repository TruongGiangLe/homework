package chapter03_array;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study004();
		
		
		

	}
	// tổng, Max, Min
	
	public static void study004() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so phan tu cua mang");
		//Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arrayOne = new int[a];
		System.out.println(" nhap cac phan tu cua mang");
		for( int n = 0; n < a; n++) {
			arrayOne[n] = sc.nextInt();
			
			
		}
		sc.close();
		int sum = 0;
		int max = arrayOne[0];
		int min = arrayOne[0];
		for(int n = 0; n < a; n++) {
			sum += arrayOne[n];
			if( arrayOne[n] < min) min = arrayOne[n];
			if( arrayOne[n] > max) max = arrayOne[n];
			
			
			
		}
		System.out.println("tong " + sum);
		System.out.println("phan tu lon nhat " + max);
		System.out.println("phan tu nho nhat " + min);
		
		
		
		
		
		
		
	}
	
	
	
	// nhập các phân tử vào mảng
	public static void study003() {

	    
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so phan tu cua mang");
		int length  = sc.nextInt();
		sc.nextLine();
		int[] arrayNumber = new int[length];
		for(int i = 0; i < length; i++) {
			System.out.printf("phan tu thu %d: %n", i);
			arrayNumber[i] = sc.nextInt();
			sc.nextLine();
			
		}
		for(int n: arrayNumber) {
			System.out.println(n);
		}
		
		
		sc.close();
		
		
	}
	// đưa ra các phần tử của mảng
	public static void study001() {
		//System.out.println("Array basic");
		// khai báo mảng
		int arrayOne[];
		int[] arrayTwo;
		// Khai báo mảng và cấp vùng nhớ
		
		//int[] arrayInt = new int[5];
		int[] arrayInt = {1, 2, 3, 4, 5};
		// mảng arrayInt sẽ có 5 phần tử
//		arrayInt[0]   = 30;
//		arrayInt[1]   = 30;
//		arrayInt[2]   = 30;
//		arrayInt[3]   = 30;
//		arrayInt[4]   = 30;
		//arrayInt[5]   = 30; lỗi ngay vì nó chỉ có 5 phần tử
		String arrayStr[] = {"le", "truong", "Giang", "le", "truong"};
		System.out.println("Phần tử thứ nhât "  + arrayStr[0]);
		
		
	}
	// khai báo mảng
	public static void study002() {
		
		int[] arrayInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("tong so phan tu " + arrayInt.length);
		System.out.println("phan tu dau tien " + arrayInt[0]);
		System.out.println("phan tu cuoi cung " + arrayInt[arrayInt.length - 1]);
		System.out.println("phan tu o giua mang" + arrayInt[(arrayInt.length - 1)/2]);
		
		int length = arrayInt.length;
		
		for( int i = 0; i <= length - 1; i++) {
			System.out.printf("Phan tu thu" + " %d: %d %n" , i, arrayInt[i]);
			
		}
		
		for(int n: arrayInt) {
			// cách viết khác, ở đây n là giá trị của các phần tử của mảng
			System.out.println(n);
		}
	}

}
