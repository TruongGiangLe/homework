package chapter02.oop;

//import chuong1.basic.Teacher;

//import chuong1.basic.Teacher;
// nếu muốn khai báo đôi tượng của 1 lớp khác không có trong package thì phải có dòng này để đưa nó vào

public class Main { // tên tập tin và tên class phải trùng với nhau
	//STATIC KEYWORD
	public static void main(String[] args) {
		counter counterObj1 = new counter();
    	counter counterObj2 = new counter();
//		counter counterObj3 = new counter();
//		
//		
//		counterObj1.showCount();
//		counterObj2.showCount();
//		counterObj3.showCount();
//		
	   // System.out.println(counter.count);
	    // trong trường hợp biến count đã đc khai báo là static thì có thể dùng cách này để in ra 
	    counter.showCount();
		
		
		
	}
	//OVERRIDING
	public static void main006(String[] args) {
		Student studentObj = new Student(null, null, 0);
		studentObj.setName("Peter");
		studentObj.setCode("SV001");
		studentObj.setBirthday(1998);
		studentObj.setScore(8.5);
		studentObj.showInfo();
		
		
		
	}
	
	
	
	
	//INHERITANCE
	public static void main005(String[] args) {
	     Person personObj = new Person(null, null, 0);
	     //personObj.showInfo();
	     Student studentObj = new Student(null, null, 0);
	     studentObj.setName("Peter");
	     studentObj.showInfo();
	     Teacher teacherObj = new Teacher();
	     teacherObj.setName("Inverse");
	     teacherObj.showInfo();

}
	
	
	
	
	public static void main004(String[] args) {
		Student studentOne     = new Student(null, null, 0);
		studentOne.showInfo();
		Teacher teacherOne     = new Teacher();
		teacherOne.showInfo();
		
		
		
	}
	
	
	
	//CONSTRUCTOR
	public static void main003(String[] args) {
	Student studentOne = new Student(null, null, 0);
	studentOne.showInfo();
	
	
	
	}
	//OVER LOADING
	public static void main002(String[] args) {
		Student studentOne = new Student(null, null, 0);
		studentOne.setCode("S001");
		//System.out.println("code: " + studentOne.getCode());
		//studentOne.setCode();
		//System.out.println("code: " + studentOne.getCode());
		//studentOne.setCode("sv", 123);
		//System.out.println("code: " + studentOne.getCode());
		//studentOne.setCode(456);
		System.out.println("code: " + studentOne.getCode());
		
		
	}
	

	public static void main001(String[] args) {

		// TODO Auto-generated method stub
         // System.out.println("OOP");
        //  System.out.println("Main.main()");
          
          
          Student studentOne = new Student(null, null, 0);
         // Teacher teacher = new Teacher();
          //studentOne.birthday = 1994;
          //studentOne.code = "S001";
          //studentOne.name = "JOHN";
          studentOne.setBirthday(1994);
          studentOne.setName("JOHN");
          studentOne.setCode("S001");
          studentOne.showInfo();
          int age = studentOne.getAge();
          System.out.println(age);
          
          
//          
//          System.out.println("name: " + studentOne.getName());
//          System.out.println("code: " + studentOne.getCode());
//          System.out.println("birthday: " + studentOne.getBirthday());
//          
      
	}

}
 