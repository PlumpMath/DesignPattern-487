package abstractfactory1;

public class USAAddressfactory implements AddressfFactory{
	
		// Lớp này là một lớp Factory để khởi tạo đối tượng 
		// cụ thể của Address và PhoneNumber
		// Ví dụ : USAAddress và USAPhoneNumber

	
	@Override
	public Address createAddress() {
		// TODO Auto-generated method stub
		return new USAAddress();
	}
	
	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new USAPhoneNumber();
	}

}
