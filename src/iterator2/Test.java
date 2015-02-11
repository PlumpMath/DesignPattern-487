package iterator2;

public class Test {

	Division division;
	DivisionIterator iterator;

	public Test() {
		// TODO Auto-generated constructor stub
		division = new Division("Sales");

		division.add("Ted");
		division.add("Bob");
		division.add("Carol");
		division.add("Alice");

		iterator = division.iterator();
		while (iterator.hasNext()) {
			VP vp = iterator.next();
			vp.print();

		}
	}

	public static void main(String[] args) {

	}

}
