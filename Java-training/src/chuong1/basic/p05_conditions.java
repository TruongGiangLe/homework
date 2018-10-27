package chuong1.basic;

public class p05_conditions {
	public static void main(String[] args) {
//	''
//	if(tmp == 0) {
//		System.out.println("số chẵn");
//	}
//	if(tmp == 1) {
//		System.out.println("số lẻ");
//	}
	//if(tmp == 0) result = "số chẵn";
//	if(number == 0) System.out.println("số không ");
//	if(number < 0) {
//		int tmp = -number;
//		if(tmp % 2 == 0) result = " số âm chẵn";
//		 else result = "số âm lẻ";
//	}
//	if(number > 0) {
//		if(number % 2 == 0) result = " số dương chẵn";
//		 else result = "số dương lẻ";
//		
//		
//	}
//	System.out.println(result);
	int number    = 5;
	String result ="";
	switch (number) {
	      case 2: 
	    	  result="thứ hai";
	    	  System.out.println(result);
	      case 3:
	    	   result="thứ ba";
	    	   System.out.println(result);
	      case 4:
	    	  result="thứ tư";
	    	  System.out.println(result);
	      case 1:
	    	  result="chủ nhật";
	    	  System.out.println(result);
	    	  break;
	      case 8:
	    	  result="chủ nhật";
	    	  System.out.println(result);
	    	  break;
	      default:
	    	   result="không hợp lệ";
	    	 
	}
	System.out.println(result);

}
	
}
