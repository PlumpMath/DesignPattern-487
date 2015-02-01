package bridge2;

public class Test {

	public static void main(String[] args) {

		Day day = new Monday(new OrdinaryDay());
		day.action();

	}

}
