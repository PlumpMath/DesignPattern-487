package prototype1;

public abstract class AddressPrototype {
	
	private String street;
	private String city;
	private String country;
	
	public AddressPrototype() {
		// TODO Auto-generated constructor stub
	}

	public AddressPrototype(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * phương thức này sẽ cho các lớp con cài để
	 * để trà lại đối tượng bản sao với các trạng thái như chính
	 * đối tượng ban đầu
	 */
	public abstract AddressPrototype copy();

}
