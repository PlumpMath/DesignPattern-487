package templatemethod2;

public class CookieRobot extends RobotTemplate {

	private String name;

	public CookieRobot(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void getParts() {
		// TODO Auto-generated method stub
		System.out.println("Getting flour and sugar .......");
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Baking a cookie .......");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Crunch a cookie .......");
	}

	public String getName() {
		return name;
	}

}
