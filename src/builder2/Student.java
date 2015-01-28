package builder2;

/**
 * @author Quang Huy
 * Mẫu Builder cho phép ta áp dụng để thay thế 
 * những mấu contructor cũ như mẫu JavaBean và TeleScoping
 * Mẫu buildeer khắc phục nhược điểm của 2 mẫu còn lại khi 
 * số lượng tham số truyền vào cho hàm khởi tạo quá lớn
 */
public class Student {

	private final String name;
	private final String address;
	private final int age;
	private final String city;
	private final int phoneNumber;
	private final String capital;

	/**
	 * Thường thì các hàm Builder không cho client
	 * khởi tạo đối tượng bằng construtor
	 */
	private Student(Builder builder) {
		// TODO Auto-generated constructor stub
		this.name = builder.name;
		this.address = builder.address;
		this.age = builder.age;
		this.city = builder.city;
		this.phoneNumber = builder.phoneNumber;
		this.capital = builder.capital;
	}

	/**
	 * Inner class hay được gọi là 
	 * Nest class
	 *
	 */
	public static class Builder {

		private final String name;
		private final String address;
		private int age = 0;
		private String city = "";
		private int phoneNumber = 0;
		private String capital = "";

		public Builder(String name, String address) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.address = address;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public Builder setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder setCapital(String capital) {
			this.capital = capital;
			return this;
		}

		/**
		 * @trả lại đối tượng Student
		 */
		public Student build() {
			return new Student(this);
		}

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getCapital() {
		return capital;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = " student " + this.getAge() + " years old ";
		System.out.println(string);
		return string;
	}

}
