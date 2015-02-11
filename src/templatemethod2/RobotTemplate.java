package templatemethod2;

public abstract class RobotTemplate {

	public final void go() {
		start();
		getParts();
		assemble();
		test();
		stop();
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping ..............");
	}

	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Testing ..............");
	}

	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Assemble ..............");
	}

	public void getParts() {
		// TODO Auto-generated method stub
		System.out.println("Geting parts..............");
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting ..............");
	}

}
