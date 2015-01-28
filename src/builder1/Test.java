package builder1;


public class Test {

	public static void main(String[] args) {
		AddressDirector director = new AddressDirector();
		USAAddressBuilder builder = new USAAddressBuilder();
		director.Contruct(builder, "ABC", "CDE", "FGH");
		Address address = builder.getAddress();

		System.out.println(address.getStreet());
		System.out.println(address.getCity());
		System.out.println(address.getRegion());
	}

}
