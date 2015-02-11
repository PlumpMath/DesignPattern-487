package iterator1;

import iterator2.Division;
import iterator2.VP;

public class Test {

	ConcreteAggegate aggegate;
	ConcreateIterator iterator;

	public Test() {
		// TODO Auto-generated constructor stub
		aggegate = new ConcreteAggegate();

		aggegate.add("Ted");
		aggegate.add("Bob");
		aggegate.add("Carol");
		aggegate.add("Alice");

		iterator = aggegate.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);

		}
	}

	public static void main(String[] args) {
		new Test();
	}

}
