package chuong1.basic;

public class p09_constructshape {
	public static void main(String[] args) {
		//int number     = 1;
		//int j     = number;
//		while(number > 0) {
//			for(int i = 0; i < number; i++) {
//				System.out.print(" * ");
//				
//			}
//			System.out.println();
//			number--;
//			
//		}
//		while(number < 6) {
//			for(int i = 1; i < (6 - number); i++)
//				System.out.print("  ");
//			for(int i = number; i >= 1; i--)
//				System.out.print("* ");
//			for(int i = number - 1; i >= 1; i--)
//				System.out.print("* ");
////			for(int i = 2; i <= number; i++) {
////				//if(i == number) continue;
////				System.out.print(i);
////			}
//			//for(int i = number; i < ())
//			//for(int i = 0; i < number; i++)
//			//	System.out.print( "* ");
//				
//			System.out.println();
//			number++;
//		}
//		while(number < 9) {
//			if( 2 <= number && number <= 7) {
//				for(int j = 0; j < 1; j++)
//					System.out.print("*             *");
//			} else 
//				for(int i = 1; i < 9; i++) {
//				   System.out.print("* ");
//			}
//			System.out.println();
//			number++;
			
			
		
	/*              result       line      *        space
	 *                *           1        1          3      space = height - line
	 *               ***          2        3          2      * = 2 * line -1
	 *              *****         3        5          1  
	 *             *******        4        7          0
	 * 
	 * 
	 */
		int number     = 1;
		String result     = "";
//		String space = "";
//		String character = "";
		final int HIGHT     = 9; // hằng số phải viết hoa
		String shape    ="";
		
		while (number < 10) {
			String space = "";
			String character = "";
			
			for( int i = 1; i <= HIGHT - number; i++) space = space + "  ";
			// write space
			for(int j = 1; j <= 2 * number - 1; j++) character = character + " *";
			// write *
			result = space + character + "\n"; // write result
			shape  = shape + result;
			
			number++;
		}
		System.out.print(shape);
		
		
	}
}
	


