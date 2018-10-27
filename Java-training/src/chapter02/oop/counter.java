package chapter02.oop;

public class counter {

	public static int count  = 0;
	public static String collge     = "HUST";
	public counter() {
		count++;
	}
	public static int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	// phương thức static chỉ có thể gọi đc biến static
	// các phương thức muốn truy cập vào cũng cần phải đc khai báo static
	public static void showCount() {
		System.out.println("collge: " + collge);
		System.out.println("count: " + count);
		System.out.println("count: " + getCount());
	}
	
	
	
	
	
}
