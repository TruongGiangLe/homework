package chuong1.basic;

import java.util.Scanner; // phải có cái này

public class p08_Findmysteriousnumber {
	public static void main(String[] args) {
		final int Max    = 100;
		final int Min     = 1;
		int range   = (Max - Min) + 1;
		int secretNumber  = (int)(Math.random() * range) + Min;
		System.out.println("A mysterious number is chosen. Can you guess it?");
		
		Scanner a = new Scanner(System.in);
		int turn = 0;
		int yourNumber   = 0;
		while(yourNumber != secretNumber) {
			System.out.println("Enter your number in (1-100): ");
			 yourNumber = a.nextInt();
			 turn++;
			
			 if(yourNumber < secretNumber) System.out.println("Your number is less than secret number");
			 if(yourNumber > secretNumber) System.out.println("Your number is bigger than secret number");
			 
			 }
		 a.close();
		if(yourNumber == secretNumber) System.out.println("exactly! your answer is correct! your need " + turn + " turn to guess right!");
		
	}

}
