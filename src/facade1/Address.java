package facade1;

/**
 * Lớp Address là lớp sẵn có
 * Lưu trữ số địa chỉ
 */
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
