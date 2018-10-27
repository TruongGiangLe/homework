package chapter05_string;

public class StringBasic {
	
	public static void main(String[] args) {
		
		study005();
	}
	
	
   // khai báo xâu 
	public static void study001() {
		
		String str1 = "java is not difficult";
		
		String str2 = new String();
		str2 = "java is not difficult";
		
		String str3 = new String("java is not difficult");
		
		System.out.println(str1);
	}
	
	//nối xâu
	public static void study002() {
		
		String str1 = " java";
		String str2 = "is not difficult";
		String str3 = str1 + str2;
		String str4 = str1.concat(" ").concat(str2);
		// str4 = str1+  +str2;
		System.out.println(str4);
		
		
	}
	
	// chuyển đổi xâu thành số
	public static void study003() {
		
		String str1 = "987";
		System.out.println(str1 + 4);
		
		int number = Integer.parseInt(str1);
		System.out.println(number + 4);
		
	}
	
	
	//lưu ý v�? cách khai báo xâu
	public static void study004() {
		
		String str1 = "java";
		String str2 = "java";
		// trong cách khai báo trên str1 và str2 cùng tr�? vào 1 vùng nhớ có giá trị là java 
		// nên chúng sẽ bằng nhau, khi dùng toán tử == để so sánh thì nó sẽ so sánh giá trị của 
		// str1 và str2 tức là so sánh địa chỉ của java nê chắc chắn sẽ bằng nhau
		
		String str3 = new String("java");
		// cách khai báo như này sẽ tạo ra 1 vùng nhớ có giá trị là java và str3 tr�? đến nó
		// hai cách khai báo như trên là hoàn toàn khác nhau v�? bản chất
		
		
		
		if (str1 == str3) System.out.println("equal");
		else System.out.println("not equal");
		
	}
	
	// phương thức equal và equalinogrecase
	public static void study005() {
		
		String str1 = "Android.vn";
		String str2 = "android.VN";
		
		System.out.println("so sánh phân biệt chữ hoa và chữ thư�?ng:" + str1.equals(str2));
		System.out.println("so sánh không phân biệt chữ hoa và chữ thư�?ng: " + str1.equalsIgnoreCase(str2));
		StringBuilder str = new StringBuilder("hi");
		
	}
	
	// sự dư thừa của vùng nhớ
	public static void study006() {
		
		String str1 = "java is not difficult";
		str1 = "java is easy";
		str1 =" java is diffcult";
	}
	
	

}
