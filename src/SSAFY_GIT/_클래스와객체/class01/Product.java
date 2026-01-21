package SSAFY_GIT._클래스와객체.class01;

public class Product {
	String pCode;
	String pName;
	int price;
	int quantity;
	String brand;
	String desc;
	
	Product() {
	}
	
	Product(String pCode, String pName, int price, int quantity, String brand, String desc) {
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.desc = desc;
		
	}
	public String toString() {
		return String.format("Product [pCode=%s, pName=%s, price=%s, quantity=%s, brand=%s, desc=%s]", pCode, pName, price, quantity, brand, desc);
	}
	
}
