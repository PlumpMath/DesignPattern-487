package abstractfactory1;

public class FrenchPhoneNumber extends PhoneNumber {

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return 543210 + super.getNumber();
	}

}
