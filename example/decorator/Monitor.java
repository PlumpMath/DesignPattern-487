package decorator;

public class Monitor extends ComponentDecorator {

	Computer computer;

	public Monitor(Computer currentComputer) {
		// TODO Auto-generated constructor stub
		computer = currentComputer;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return computer.description() + " and a monitor ";
	}

}
