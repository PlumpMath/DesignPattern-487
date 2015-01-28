package abstractfactory1;

public abstract class Address {

	private String street;
	private String city;
	private String region;
	private String portalCode;

	public Address() {
		// TODO Auto-generated constructor stub
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPortalCode() {
		return portalCode;
	}

	public void setPortalCode(String portalCode) {
		this.portalCode = portalCode;
	}

}
