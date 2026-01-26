package _클래스와객체;

public class Restaurant {

	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;

	Restaurant() {
	}

	Restaurant(int resId, String name, String address, String signatureMenu, int rate) {
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}

	public String toString() {
		return String.format("Restaurant [resId=%s, name=%s, address=%s, signatureMenu=%s, rate=%s]", resId, name,
				address, signatureMenu, rate);
	}

}
