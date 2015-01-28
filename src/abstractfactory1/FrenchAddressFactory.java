package abstractfactory1;

public class FrenchAddressFactory implements AddressfFactory {
	
	// Lớp này là một lớp Factory để khởi tạo đối tượng 
	// cụ thể của Address và PhoneNumber
	// Ví dụ : FrenchAddress và FrenchPhoneNumber

	@Override
	public Address createAddress() {
		// TODO Auto-generated method stub
		return new FrenchAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new FrenchPhoneNumber();
	}

}
