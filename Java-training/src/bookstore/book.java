package bookstore;

public class book {
	
	private String ID;
	private String name;
	private double price;
	
	public book(String ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
		
	}
	
	
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void showInfor() {
		System.out.println("-Name:" + this.name);
		System.out.println("-ID:" + this.ID);
		System.out.println("-Price: " + this.price);
	}
	

}
