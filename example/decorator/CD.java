package decorator;

public class CD extends ComponentDecorator {

	Computer computer;

	public CD(Computer currentComputer) {
		// TODO Auto-generated constructor stub
		computer = currentComputer;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return computer.description() + " and a CD ";
	}
}
