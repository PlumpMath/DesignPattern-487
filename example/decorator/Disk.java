package decorator;

public class Disk extends ComponentDecorator {

	Computer computer;

	public Disk(Computer currentComputer) {
		// TODO Auto-generated constructor stub
		computer = currentComputer;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return computer.description() + " and a disk ";
	}

}
