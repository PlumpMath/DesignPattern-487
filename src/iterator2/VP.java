package iterator2;

public class VP {

	private String name;
	private String division;

	public VP(String name, String division) {
		super();
		this.name = name;
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("Name :" + name + "Division" + division);
	}

}
