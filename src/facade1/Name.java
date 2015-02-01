package facade1;

/**
 * Lớp Name là lớp sẵn có
 * Lưu trữ số tên
 */

public class Name {
	
	private String name;

	public String getName() {
		return name;
	}

	public void createAddress(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Name: " + getName());
	}


}
