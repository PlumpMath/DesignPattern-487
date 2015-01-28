package prototype2;

/**
 * @author Quang Huy
 *	Mẫu prototype giúp ta khởi tạo lại đối tượng mới
 *  có các trạng thái giống hệt đối tượng ban đầu  
 */
public class Student {

	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	/**
	 * @return đối tượng được copy với các trạng thái y hệt
	 * đối tượng ban đầu
	 */
	public Object copy() {
		return new Student(name, age, address);
	}

}
