package abstractfactory1;

public interface AddressfFactory {
	
	/*
	 * Lớp abstract factory để khởi tạo các lớp ảo Address và PhoneNumber
	 * Lớp nào implements lớp này sẽ khởi tạo thể hiện cụ thể của 2 lớp Address
	 * và PhoneNumber 
	 * */
	
	public Address createAddress();
	public PhoneNumber createPhoneNumber();

}
