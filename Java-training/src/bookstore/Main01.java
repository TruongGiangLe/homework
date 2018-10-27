package bookstore;

import java.util.Scanner;

public class Main01 {
	private static Store storeObj     = new Store();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc     = new Scanner(System.in);
		int functionID   = 0;
		boolean flag     = true;
		
		do {
			showMenu();
			functionID    = sc.nextInt();
			switch (functionID) {
			case 1: addBook();
			      break;
			case 2: editBook();
				break;
			case 3: deleteBook();
				break;
			case 4: findBook();
				break;
			case 5: listBook();
				break;
			case 6:
			default:
				flag = false;
				break;
			}
			
			
			
			
		} while(flag == true);
	}
		
		public static void showMenu() {
			myPrint("---------------------Menu--------------------");
			myPrint("1.Add book");
			myPrint("2.Edit book");
			myPrint("3.Delete book");
			myPrint("4.Find book");
			myPrint("5.List book");
			myPrint("6.Exit");
			myPrint("Your choice is (1-6): ");
		}
		public static void myPrint(String content ) {
			System.out.println(content);
			
		}
		
		public static void addBook() {
			if(storeObj.checkFull()) System.out.println("store is full");
			else {
			Scanner sc = new Scanner( System.in);
			String bookID   = "";
			String name     = "";
			double price    = 0;
			myPrint(" ID :");
			bookID     = sc.nextLine();
			
			myPrint(" name: ");
			name     = sc.nextLine();
			
			myPrint(" price: ");
			price    = sc.nextInt();
			
			book bookObj = new book(bookID, name, price);
			storeObj.add(bookObj);
		
			}
			
			
		}
		public static void editBook() {
			String bookID = "";
			String bookName = "";
			double price    = 0;
			myPrint(" Enter ID of book you want edit: ");
			Scanner sc = new Scanner(System.in);
			bookID = sc.nextLine();
			if(storeObj.getItemPosition(bookID) == -1) myPrint("this book is not exist!");
			else {
			
		    myPrint(" new name: ");
		    bookName  = sc.nextLine();
		    
		    myPrint(" new price: ");
		    price   = sc.nextDouble();
		    
		    storeObj.edit(bookID, bookName, price);
			}
		    }
		
		public static void deleteBook() {
			String bookID = "";
			myPrint(" enter ID of the book you want to reject away store:");
			Scanner sc = new Scanner(System.in);
			bookID     = sc.nextLine();
			if(storeObj.getItemPosition(bookID) == -1) myPrint("this book is not exist!");
			else {
				storeObj.delete(bookID);
			}
			
			
		}
		public static void findBook() {
			String bookID = "";
			Scanner sc   = new Scanner(System.in);
			System.out.println(" Enter ID of book: ");
			bookID = sc.nextLine();
			storeObj.find(bookID);
}
		public static void listBook() {
			storeObj.list();
			
		}
		
		

	}


