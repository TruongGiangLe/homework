package bookstore;

import java.util.Scanner;

public class Main {
    private static book bookObj = null;
	public static void main(String[] args) {
//		static book bookObj = null;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int functionID;
		boolean flag     = true;
		do {
			
			showMenu();
			functionID     = sc.nextInt();
			sc.nextLine();
			switch (functionID) {
			case 1: addBook(); break;
			case 2: editBook(); break;
			case 3: inforBook(); break;
			case 4: flag = false; break;

			default:
				break;
			}
		

	} while ( flag == true);
		sc.close();
	}
	
	public static void showMenu() {
		print("---------------------Menu--------------------");
		print("1.Add");
		print("2.Edit book");
		print("3.Infor book");
		print("4.Exit");
		print("Your choice is (1-4): ");
	}
	public static void print(String content ) {
		System.out.println(content);
		
	}
	public static void addBook() {
		Scanner sc = new Scanner(System.in);
		String bookName = "";
		String bookID   = "";
		double price    = 0;
		
		print(" Name: ");
		bookName     = sc.nextLine();
		
		print(" ID: ");
		bookID     = sc.nextLine();
		
		print(" Price: ");
		price     = sc.nextDouble();
		
		bookObj = new book(bookID, bookName, price);
	}
	
	
	public static void editBook() {
		if(bookObj != null) {
			Scanner sc = new Scanner(System.in);
			String bookName = "";
			String bookID   = "";

			print(" Name: ");
			bookName     = sc.nextLine();
			
			print(" ID: ");
			bookID     = sc.nextLine();
			
			bookObj.setName(bookName);
			bookObj.setID(bookID);
			
		}
		else print("quyển sách chưa tồn tại");
		
	}
	
	
	public static void inforBook() {
		if(bookObj != null)
		  bookObj.showInfor();
		else print("quyển sách chưa tồn tại");
	}
	

}
