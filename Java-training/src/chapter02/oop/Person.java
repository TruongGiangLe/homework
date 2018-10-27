package chapter02.oop;

import java.util.Calendar;

 public class Person {
	private String name;
	public String code;
	public int birthday;

	
	
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public int getAge() {
		int age = 0;
		//System.out.println("Student.getAge()");
		Calendar now = Calendar.getInstance();
		
	//	System.out.println(now.get(Calendar.YEAR));
		age = now.get(Calendar.YEAR) - this.birthday;
		return age;
	}
	 //CONSTRUCTOR
	
	
	public Person(String vName, String vCode, int vBirthday) {
		
		this.name       = vName;
		this.code       = vCode;
		this.birthday   = vBirthday;
	   
	}
	 public void showInfo() {
		 
		 System.out.println("-------------------------------");  
        System.out.println("name \t\t: " + this.getName());
        System.out.println("code  \t\t: " + this.getCode());
        System.out.println("birthday \t: " + this.getBirthday());
        System.out.println("age \t\t: " + this.getAge());
        
	}
	
	
	
}
