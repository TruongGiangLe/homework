package chapter06.oop.adv;


public class Main {



public static void main(String[] args) {
	study002();
	
	
}

//Abstract class
/* 
 * abstract class (lớp trìu tượng) là các class chứa nội bộ khung cơ bản, với các thuộc
 * tính, các phương thức và các phương thức trìu tượng (abstract method, phương thức chưa
 * hoàn thiện: chỉ có tên, kiểu trả về, tham số)
 * 
 * Các lớp extends từ lớp abstract sẽ có nhiệm vụ hoàn thiện các abstract method
 * 
 * Abstract class thường được xây dựng bởi kĩ sư thiết kế hệ thống có kinh nghiệm
 * 
*/

public static void study001() {
	
	Laptop laptopObj  = new LaptopAcer();
	//Laptop lúc này đã là lớp trìu tượng nên có thể làm như này
	// có thể override 1 method như bình thường
	
	laptopObj.keyboard();
	laptopObj.mainboard();
	laptopObj.chipset();
}

/*
 * lưu ý: không thể tạo ra 1 đối tượng từ 1 class Abstract
 * trong class abstract, method nào là abstract thì các method đó phải đc định nghĩa trong các subclass kế thừa từ nó
 * khi khai báo 1 abstract method chỉ cần gồm có tên, kiểu trả về, tham số có thể có hoặc không 
 * khi định nghĩa abstract ở các class con thì tên, kiêu trả về kiểu tham số cũng cần phải giống như trong abstract class cha
 * 
 *
 */


//Interface
/*
 * interface không phải là 1 class, đây là 1 mẫu giao diện qui định một số  phương thức bắt buộc cho 1 class nào đó
 * 
 * interface không cho phép định nghĩa rõ cách hoạt động của phương thức chỉ dừng lại ở mức
 * khai báo phương thức, việc định nghĩa các phương thức này sẽ đc thực hiện ở các class con
 * 
 * dùng từ khoá implements để kế thừa từ 1 interface
 * 
 * các method trong subclass muốn sử dụng buộc phải định nghĩa lại các method có trong interface mà nó kế thừa
 *
 * không thể khai báo 1 đối tượng qua interface mà phải qua subclass của nó
 *
 * tạo 1 method trong subclass thì không thể truy cập đc từ đối tượng đc khai báo từ interface, phải thay đổi cách khai báo
 * 
 * có thể implements nhiều interface cùng lúc, cũng có thể vừa extends vừa interface, khi đó cậu có thể truy cập đc vào các method của nó
 * 
 * chỉ có thể extends từ 1 class, nhưng có thể implements từ nhiều interface khác nhau
 * 
 * extends từ bất kì abstract class nào cũng đều phải xậy dựng lại các abstract method của nó ( interface cũng là 1 loại abstract class )
 * 
 * 
 */
public static void study002() {
	 Superman peopleObj  = new Superman();
	 peopleObj.eat();
	 peopleObj.sleep();
	 peopleObj.abc();
	 peopleObj.fly();
	 peopleObj.chipset();
	 peopleObj.mainboard();
	
}


}
