package interpreter1;

import java.util.ArrayList;

public class NonterminalExpression implements Expression {

	private ArrayList<Expression> expression;

	public ArrayList<Expression> getExpression() {
		return expression;
	}

	public void setExpression(ArrayList<Expression> expression) {
		this.expression = expression;
	}

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		if (expression != null) {
			for (Expression e : expression) {
				e.interpret(context);
			}
		}
	}

}
