package facade1;

/**
 * Lớp Person được sinh ra để sử dụng 3 lớp Name , PhoneNumber và Address 
 * Bản chất mẫu Facade là để client tương tác với lớp facade thay vì phải 
 * xử lí với nhiều lớp khác .
 */
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
