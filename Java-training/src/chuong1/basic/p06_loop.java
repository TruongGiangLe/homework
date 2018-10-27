package chuong1.basic;

public class p06_loop {
	public static void main(String[] args) {
//		int number     = 8;
//		for(int i = 0; i < 10; i++) {
//		
//		
//		//System.out.println("Java is not difficult");
//		}
//		int j  = 0;
//		while(j < 10) {
//			//System.out.println(j + " Java is not difficult");
//			j += 2;
//			
//		}
//		int k = 1;
//		do {
//			System.out.println(k);
//			k++;
//			
//		} while (k < 5);
//		
		//int number     = 5;
		//int i     = 1;
//		for(int j = 2; j < 10; j++) {
//			System.out.println("bang cuu chuong " + j + ":");
//		int i = 1;
//        do {
//        	System.out.printf("%d * %d = %d  %n", j, i, j*i);
//        	i++;
//        } while(i < 10);
//        System.out.println();
//		
//		
//		
//	}
		for(int i = 1; i <= 20; i++) {
			if(i % 7 == 0) {
				System.out.println(" Ok " + i);
				break;
			}
			
			System.out.println(i);
		}
	}
}
