package interpreter1;

public class TerminalExpressionNumber implements Expression {

	private int number;

	public TerminalExpressionNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		context.push(number);
	}

}
