package mediator2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase {

	private Mediator mediator;
	private String response = "n";

	public Purchase(Mediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
	}

	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Buy the item now? [y/n]");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		try {
			response = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (response.equalsIgnoreCase("y")) {
			System.out.println("Thanks for your purchase.");
		}

		mediator.handler("purchase.exit");

	}

}
