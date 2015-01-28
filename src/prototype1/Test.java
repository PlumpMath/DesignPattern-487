package prototype1;

public class Test {

	public static void main(String[] args) {

		AddressPrototype add = new USAAddressPrototype("ABC", "DEF", "HIK");
		System.out.println(add.getStreet());
		System.out.println(add.getCity());
		System.out.println(add.getCountry());

		AddressPrototype add2 = add.copy();
		System.out.println(add2.getStreet());
		System.out.println(add2.getCity());
		System.out.println(add2.getCountry());

	}

}
