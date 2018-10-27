package chapter02.oop;

import java.util.Calendar;

public class Student extends Person{
	
	public Student(String vName, String vCode, int vBirthday) {
		super(vName, vCode, vBirthday);
		// TODO Auto-generated constructor stub
	}
	public double score;
	
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void showInfo() {
		super.showInfo();		
        System.out.println("score \t\t: " + this.getScore());		
		
	}
	
	
	
	 //CONSTRUCTOR
	
	
	
	
	
}
