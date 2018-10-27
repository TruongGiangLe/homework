package chapter03_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study007();

	}
	
	// tìm phần tử lớn nhất của mảng
	public static void Study007() {
		int[][] arrayMulti     = {{1, 13, 3, 1134}, {5, 76, 7, 998}, {9, 810, 11, 912}};
		int max      = 0;
		for ( int i = 0;  i < arrayMulti.length; i++) {
		Arrays.sort(arrayMulti[i]);
		//max     = arrayMulti[i][ arrayMulti[i].length - 1];
		if(arrayMulti[i][ arrayMulti[i].length - 1] > max) max = arrayMulti[i][ arrayMulti[i].length - 1];
		}
		System.out.println(max);
		
		
		
		
		
		
	}
	
	
	
	
	
	// tính tổng các phần tử trong 1 cột
	public static void Study004() {
		int[][] arrayMulti     = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int sum      = 0;
		for( int i = 0; i < arrayMulti.length; i++) {
			sum += arrayMulti[i][0];
			//System.out.println(arrayMulti[i][0]);
		}
		System.out.println(sum);
	}
	
	
	
	
	
	// tính tổng các phần tử trong 1 hàng
	public static void Study005() {
		int[][] arrayMulti     = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int sum      = 0;
		for(int n : arrayMulti[2]) {
			sum += n;
		}
		System.out.println(sum);
	}
	
	
	
	//tính tổng các phân tử trên đường chéo của ma trận vuông
	public static void Study006() {
		int[][] arrayMulti     = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int sum      = 0;
		for( int i = 0; i < arrayMulti.length; i++)
			sum += arrayMulti[i][i];
		System.out.println(sum);
		
		
		
		
		
		
	}
	
	
	
	
	// nhập giá trị vào mảng
	public static void Study002() {
		int rows, colums;
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap so hang rows: ");
		rows     = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" nhap so cot colums: ");
		colums     = sc.nextInt();
		sc.nextLine();
		
		int[][] arrayMulti     = new int[rows][colums];
		for(int i = 0; i < rows; i++)
			for( int j = 0; j < colums; j++) {
				System.out.printf(" hang %d cot %d:", i, j);
				arrayMulti[i][j]     = sc.nextInt();
				sc.nextLine();
				}
		System.out.println(Arrays.deepToString(arrayMulti));
		
		sc.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	//khai báo mảng hai chiều và in mảng
	public static void Study001() {
		
		// 2 9 1
		// 3 6 7
		int[][] arrayMulti  = {{2, 9 , 1} , { 3, 6, 7}};
		// hai hàng và ba cột
		System.out.println("test: " + arrayMulti.length);
		// gọi như này thì  nó ra số hàng của mảng
		System.out.println("test: " + arrayMulti[0].length);
		// gọi như này thì nó ra số cột của mảng
		 
		// in ra toàn bộ mảng hai chiều
		int row   = arrayMulti.length;
		int colum = arrayMulti[0].length;
		// row là hàng và colum là cột
		for( int i = 0; i < row; i++) {
//			for( int j = 0; j < colum; j++) {
//				System.out.print( arrayMulti[i][j]);
//			}
			System.out.print(Arrays.toString(arrayMulti[i]));
		
		System.out.println();
		}
		System.out.println(Arrays.deepToString(arrayMulti));
		// deepToString giúp in ra tất cả các phân tử trong mảng đa chiều
		
	}
	
	
	

}
