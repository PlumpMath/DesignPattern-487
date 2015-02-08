package command1;

public class Receiver {

	private String name;

	public Receiver(String name) {
		super();
		this.name = name;
	}

	public void doAction() {
		System.out.println(this.name + "fulfill request!");
	}

}
