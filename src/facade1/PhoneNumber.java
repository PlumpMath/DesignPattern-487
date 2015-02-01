package facade1;
/**
 * Lớp PhoneNumber là lớp sẵn có
 * Lưu trữ số điẹn thoại
 */
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
