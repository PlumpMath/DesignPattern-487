package interpreter1;

public class TerminalExpressionMulti implements Expression{
	
	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		context.push(context.pop() * context.pop());
	}

}
