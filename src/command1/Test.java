package command1;

public class Test {

	public static void main(String[] args) {
		ConcreateCommand command = new ConcreateCommand();
		command.setReceiver(new Receiver("Huy"));

		Invoker invoker = new Invoker();
		invoker.exacuteCommand(command);

	}
}
