package facade1;
public class Address {

	private String address;

	public String getAddress() {
		return address;
	}

	public void createAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Address: " + getAddress());
	}

}
