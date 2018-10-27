package chapter06.oop.adv;

abstract public class Laptop {
	// thêm từ này vào thì nó sẽ thành class trìu tượng
	// không thể tạo ra đối tượng của class này đc, chỉ có thể tạo ra đối tượng từ các lớp extends nó mà thôi
	
	public void keyboard() {
		System.out.println("Laptop.keyboard()");
	}
	
	abstract public void mainboard() ;
	// abstract method không có nội dung gì bên trong nó kết thúc luôn bằng dấu ;
	// một abstract method muốn sử dụng thì cần phải được xây dựng lại trong subclass
	
	public void chipset() {
		System.out.println("Laptop.chipset()");
	}

}
