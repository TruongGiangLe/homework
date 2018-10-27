package bookstore;

import java.util.Scanner;

public class Store {

	private static int totalItems     = 0;  // số sách hiện có
	private final int MAX_ITEMS      = 10;  // tổng số sách có thể lưu trữ
	private book[]  listItems    = null;
	
	public static int getTotalItems() {
		return totalItems;
	}
	
	public static void setTotalItems(int totalItems) {
		Store.totalItems = totalItems;
	}
		
	public Store() {
		listItems = new book[MAX_ITEMS];
		
		
	}
	
	public int getItemPosition( String bookID ) {
		for( int i = 0; i < totalItems; i++) {
			if(bookID.equals(( listItems[i].getID()))==true) return i;
		}
		// equals dùng so sánh hai sâu String trả về kiểu boolean
		return -1;
		
	}
	
	public boolean checkFull() {
		if(this.totalItems == MAX_ITEMS) return true; 
		else return false;
		}
	public boolean checkEmpty() {
		if( this.totalItems == 0) return true;
		else return false;
		
		
	}
	
	public void add( book bookObj) {
		this.listItems[totalItems]     = bookObj;
		this.totalItems++;
		System.out.println("Add successfull!");
		// this ở đây là để chỉ đối tượng cái cửa hàng chứa sách
		
	}
	public void edit( String bookID, String bookName, double price) {
		int bookPosition     = this.getItemPosition(bookID);
		if( bookPosition == -1) System.out.println(" this book is not exist!");
		else {
			listItems[this.getItemPosition(bookID)].setName(bookName);
			listItems[this.getItemPosition(bookID)].setPrice(price);
				}
		}
	
	public void delete( String bookID) {
		int bookPosition     = this.getItemPosition(bookID);
		totalItems -=1;
		for( int i = bookPosition; i < totalItems; i++)
				listItems[i] = listItems[i+1];
		System.out.println("Delete sucessfull!");
			
				
		}
		
		
		
		
	
	
	public void find( String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if( bookPosition == -1) System.out.println("this book is not exist! ");
		else {
			listItems[this.getItemPosition(bookID)] .showInfor();
		}
}
	
	public void list () {
		if (this.checkEmpty()) System.out.println(" story is empty");
		else {
		for(int i = 0; i < totalItems; i++)
			this.listItems[i].showInfor();
		}
		}
	
	
	
}
