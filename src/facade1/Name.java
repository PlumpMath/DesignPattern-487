package facade1;

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
