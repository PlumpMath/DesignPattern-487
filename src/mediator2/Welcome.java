package mediator2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {

	private Mediator mediator;
	private String response;

	public Welcome(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void go() {
		System.out.println("Do you want to shop? [y/n]");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			response = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(response.equalsIgnoreCase("y")){
			mediator.handler("welcome.shop");
		}else{
			mediator.handler("welcome.exit");
		}
		
	}

}
