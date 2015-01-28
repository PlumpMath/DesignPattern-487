package adapter;

public class AcmeClass implements AcmeInterface {

	String firstName;
	String lastName;

	@Override
	public void setFirstName(String f) {
		// TODO Auto-generated method stub
		firstName = f;
	}

	@Override
	public void setLastName(String l) {
		// TODO Auto-generated method stub
		lastName = l;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

}
