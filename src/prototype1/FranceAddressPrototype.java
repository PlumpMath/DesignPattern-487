package prototype1;

public class FranceAddressPrototype extends AddressPrototype {

	public FranceAddressPrototype(String street, String city, String country) {
		super(street, city, country);
	}

	/* (non-Javadoc)
	 * Phương thực copy dduwwocj cài đè lại với 
	 * các tính chất y hệt đối tượng ban đầu
	 */
	
	@Override
	public AddressPrototype copy() {
		// TODO Auto-generated method stub

		return new FranceAddressPrototype(super.getStreet(), super.getCity(),
				super.getCountry());
	}

}
