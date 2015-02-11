package mediator2;

public class Mediator {

	private Shop shop;
	private Purchase purchase;
	private Welcome welcome;
	private Exit exit;

	public Mediator() {
		// TODO Auto-generated constructor stub
		shop = new Shop(this);
		purchase = new Purchase(this);
		welcome = new Welcome(this);
		exit = new Exit(this);
	}

	public void handler(String state) {

		if (state.equals("welcome.shop")) {
			shop.go();
		} else if (state.equals("shop.purchase")) {
			purchase.go();
		} else if (state.equals("purchase.exit")) {
			exit.go();
		} else if (state.equals("welcome.exit")) {
			exit.go();
		} else if (state.equals("shop.exit")) {
			exit.go();
		} else if (state.equals("purchase.exit")) {
			exit.go();
		}

	}

	public Welcome getWelcome() {
		return welcome;
	}

}
