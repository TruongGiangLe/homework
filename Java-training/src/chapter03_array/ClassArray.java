package chapter03_array;

import java.util.Arrays;// phai co cai nay moi dung đc cac method cua class mang


public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study004();
	}
	
	// in mảng sử dụng toString
	public static void Study004() {
		String arrString[] = {"toi", "chi", "yeu", "nguoi", "yeu", "minh"};
		System.out.println(Arrays.toString(arrString));
		
		
	}
	
	public static void Study003(){
		int arrInt[]  = { 12, 14, 11, 9, 10, 15, 15};
		System.out.println("Input " + Arrays.toString(arrInt));
		
		// tăng dần
		Arrays.sort(arrInt);
		System.out.println("output " + Arrays.toString(arrInt));
		
		// giảm dần
		// ta xếp lại mảng tăng dần theo thứ tự ngược lại là đc
		int elemTem = 0;
		for(int i = 0; i < arrInt.length/2; i++) {
			elemTem   = arrInt[i];
			arrInt[i]   = arrInt[arrInt.length - 1 - i];
			arrInt[arrInt.length - 1 - i]   = elemTem;
			
		}
		System.out.println("output " + Arrays.toString(arrInt));
		
		
		
	}
	
	  // su dung method copyOfRange
	   public static void Study002(){

		String arrayString[] = { "Le" , "Truong", "Giang", "lovely"};
		//String newArr[] = Arrays.copyOf(arrayString, 6);
		String newArr[] =  Arrays.copyOfRange(arrayString, 1, 3);
		// mang newArr se copy phan tu cua mang arrayString tu vi tri 0 den 1, co 1 phan tu 
		System.out.println(newArr.length);
		System.out.println(newArr[0]);
		System.out.println(newArr[1]);
		

	}
	
	// su dung method copyOf
	public static void Study001(){
		String arrayString[] = { "Le" , "Truong", "Giang", "lovely"};
		String newArr[] = Arrays.copyOf(arrayString, 6);
		// 6 là độ dài mảng mới, arrayString là mảng cũ
		newArr[4] = "alone";
		newArr[5] = "love";
		System.out.println(newArr[5]);
		

	}
		
		
		
	}


