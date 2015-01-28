package abstractfactory1;

public class Test {

	public static void main(String[] args) {

		AddressfFactory factory = new USAAddressfactory();
		Address usaAddress = factory.createAddress();
		System.out.println(usaAddress.getCity());
		PhoneNumber usaPhoneNumber = factory.createPhoneNumber();
		usaPhoneNumber.setNumber(6789);
		System.out.println(usaPhoneNumber.getNumber());
	}

}
