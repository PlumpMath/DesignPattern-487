package mediator2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shop {

	private Mediator mediator;
	private String response;

	public Shop(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void go() {
		System.out.println("Do you want to purchase? [y/n]");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			response = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(response.equalsIgnoreCase("y")){
			mediator.handler("shop.purchase");
		}else{
			mediator.handler("shop.exit");
		}
		
	}

}
