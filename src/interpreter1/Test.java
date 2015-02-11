package interpreter1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Context context = new Context();

		ArrayList<Expression> treeList1 = new ArrayList<Expression>();
		treeList1.add(new TerminalExpressionNumber(3));
		treeList1.add(new TerminalExpressionNumber(3));
		treeList1.add(new TerminalExpressionMulti());

		ArrayList<Expression> treeList2 = new ArrayList<Expression>();
		treeList2.add(new TerminalExpressionNumber(5));

		Expression nonexpLevel1 = new NonterminalExpression();
		((NonterminalExpression) nonexpLevel1).setExpression(treeList1);
		treeList2.add(nonexpLevel1);
		treeList2.add(new TerminalExpressionPlus());

		ArrayList<Expression> treeList3 = new ArrayList<Expression>();
		treeList3.add(new TerminalExpressionNumber(5));

		Expression nonexpLevel2 = new NonterminalExpression();
		((NonterminalExpression) nonexpLevel2).setExpression(treeList2);
		treeList3.add(nonexpLevel2);
		treeList3.add(new TerminalExpressionNumber(6));
		treeList3.add(new TerminalExpressionPlus());

		for (Expression expression : treeList3) {
			expression.interpret(context);
		}

		if (context != null) {
			System.out.println("Ket qua :" + context.pop());
		}
	}

}
