package templatemethod2;

public class AutomotiveRobot extends RobotTemplate {

	private String name;

	public AutomotiveRobot(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void getParts() {
		// TODO Auto-generated method stub
		System.out.println("Getting a carbulator .......");
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Installing the carbulator .......");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Revving the carbulator .......");
	}

	public String getName() {
		return name;
	}

}
