package builder1;

public class AddressDirector {

	public void Contruct(USAAddressBuilder builder, String street, String city,
			String region) {
		builder.builderCity(city);
		builder.builderRegion(region);
		builder.builderStreet(street);
	}

}
