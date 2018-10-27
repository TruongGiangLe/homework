package chuong1.basic;

import java.util.Scanner;

import java.text.DecimalFormat;

public class p10_ATM {
	



	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#,###");
		//System.out.println(formatter.format(1500000)); -> cái này trả về 1 chuỗi nên phải dùng %s để hiển thị 
		//
		//
		//
		///
		//
		//
		
		final int FIVE_HUNDRED_THOUSAND = 500000;
		final int TWO_HUNDRED_THOUSAND = 200000;
		final int ONE_HUNDRED_THOUSAND = 100000;
		final int FIFTY_THOUSAND = 50000;
		final int TWENTY_THOUSAND = 20000;
		final int TEN_THOUSAND = 10000;
		
		int fiveHundredThousand = 0;
		int twoHundredThousand = 0;
		int oneHundredThousand = 0;
		int fiftyThousand = 0;
		int twentyThousand = 0;
		int tenThousand = 0;
		
		int money     = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("How much money do you want to withdraw ?");
		    money   = sc.nextInt();
		    } while( (money % 10000) != 0);
		sc.close();
		while( money != 0) {
			if( money >= FIVE_HUNDRED_THOUSAND) {
				fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND;
				System.out.printf("Menh gia %s : %d \n", formatter.format(FIVE_HUNDRED_THOUSAND),fiveHundredThousand );
				money = money % FIVE_HUNDRED_THOUSAND;
			}
			if( money >= TWO_HUNDRED_THOUSAND) {
				twoHundredThousand = money / TWO_HUNDRED_THOUSAND;
				System.out.printf("Menh gia %s : %d \n", formatter.format(TWO_HUNDRED_THOUSAND),twoHundredThousand );
				money = money % TWO_HUNDRED_THOUSAND;
			}
			if( money >= ONE_HUNDRED_THOUSAND) {
				oneHundredThousand = money / ONE_HUNDRED_THOUSAND;
				System.out.printf("Menh gia %s : %d \n", formatter.format(ONE_HUNDRED_THOUSAND),oneHundredThousand );
				money = money % ONE_HUNDRED_THOUSAND;
			}
			if( money >= FIFTY_THOUSAND) {
				fiftyThousand = money / FIFTY_THOUSAND;
				System.out.printf("Menh gia %s : %d \n", formatter.format(FIFTY_THOUSAND),fiftyThousand );
				money = money % FIFTY_THOUSAND;
			}
			if( money >= TWENTY_THOUSAND) {
				twentyThousand = money / TWENTY_THOUSAND;
				System.out.printf("Menh gia %s : %d \n", formatter.format(TWENTY_THOUSAND),twentyThousand );
				money = money % TWENTY_THOUSAND;
			}
			if( money >= TEN_THOUSAND) {
				tenThousand = money / TEN_THOUSAND;
				System.out.printf("Menh gia %s : %d \n", formatter.format(TEN_THOUSAND),tenThousand );
				money = money % TEN_THOUSAND;
			}
			}
		
		

		
		
		
		
	}

}
