package abstractfactory1;

public class USAPhoneNumber extends PhoneNumber{
	
	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return 012345 + super.getNumber();
	}
	
	

}
