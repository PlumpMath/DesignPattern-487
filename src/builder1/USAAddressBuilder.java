package builder1;

/**
 * @author Quang Huy
 * Khởi tạo đối tượng với các thuộc tính tùy ý
 * Những thuộc tính của đối tượng không nhất thiết phải
 * được khởi tạo cùng đối tượng 
 */
public class USAAddressBuilder extends Builder {

	private Address add = new Address();

	@Override
	public void builderCity(String city) {
		// TODO Auto-generated method stub
		add.setCity(city);
	}

	@Override
	public void builderRegion(String region) {
		// TODO Auto-generated method stub
		add.setRegion(region);
	}

	@Override
	public void builderStreet(String street) {
		// TODO Auto-generated method stub
		add.setStreet(street);
	}

	public Address getAddress() {
		return add;
	}

}
