package facade1;
public class Person {

	private Address address;
	private PhoneNumber phone;
	private Name name;

	public Person(Address address, PhoneNumber phone, Name name) {
		super();
		this.address = address;
		this.phone = phone;
		this.name = name;
	}

	public void displayPersonInfo() {
		address.display();
		phone.display();
		name.display();
	}

}
