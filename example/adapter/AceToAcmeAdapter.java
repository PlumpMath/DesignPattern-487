package adapter;

public class AceToAcmeAdapter implements AcmeInterface {

	AceClass aceObject;
	String firstName;
	String lastName;

	public AceToAcmeAdapter(AceClass a) {
		// TODO Auto-generated constructor stub
		aceObject = a;
		firstName = aceObject.getName().split(" ")[0];
		lastName = aceObject.getName().split(" ")[1];
	}

	@Override
	public void setFirstName(String f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLastName(String l) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

}
