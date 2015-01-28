package facade;

public class TestFacade {

	public TestFacade() {
		// TODO Auto-generated constructor stub

		SimpleProductFacade simpleProductFacade = new SimpleProductFacade();

		simpleProductFacade.setName("printer");

		System.out
				.println("This product is a " + simpleProductFacade.getName());

	}

	public static void main(String[] args) {

		TestFacade t = new TestFacade();

	}

}
