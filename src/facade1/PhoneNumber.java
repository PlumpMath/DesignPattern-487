package facade1;
public class PhoneNumber {

	private int phoneNumber;

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void createAddress(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void display() {
		System.out.println("PhoneNumber: " + getPhoneNumber());
	}

}
