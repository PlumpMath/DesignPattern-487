package prototype1;

public class USAAddressPrototype extends AddressPrototype {

	public USAAddressPrototype(String street, String city, String country) {
		super(street, city, country);
	}

	/* (non-Javadoc)
	 * Phương thực copy dduwwocj cài đè lại với 
	 * các tính chất y hệt đối tượng ban đầu
	 */
	
	@Override
	public AddressPrototype copy() {
		// TODO Auto-generated method stub

		return new USAAddressPrototype(super.getStreet(), super.getCity(),
				super.getCountry());
	}

}
